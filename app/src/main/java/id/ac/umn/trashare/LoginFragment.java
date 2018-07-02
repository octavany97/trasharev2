package id.ac.umn.trashare;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by ASUS on 5/5/2018.
 */

public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Login");
    }

    @Override
    public void onStart() {
        super.onStart();

        final EditText username = (EditText) getActivity().findViewById(R.id.username_edit);
        final EditText password = (EditText) getActivity().findViewById(R.id.password_edit);
        String [] values = {"Yayasan","Pengurus","Anggota"};
        final Spinner spinner = (Spinner) getActivity().findViewById(R.id.spinner_wilayah);
        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        LTRadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(LTRadapter);

        Button cardLogin = (Button) getActivity().findViewById(R.id.cardLogin);
        //Button loginBtn = (Button) getActivity().findViewById(R.id.btnLogin);
        cardLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinner.getSelectedItem().equals("Member")){
                    if(username.getText().toString().equals("member") && password.getText().toString().equals("member")){
                        Intent i = new Intent(getActivity(), MemberActivity.class);
                        startActivity(i);
                        ((Activity) getActivity()).overridePendingTransition(0,0);
                        //getActivity().getFragmentManager().beginTransaction().remove(LoginFragment.this).commit();
                        getActivity().finish();
                    }
                    else{
                        Toast.makeText(getActivity(), "Username atau password tidak terdaftar!", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(spinner.getSelectedItem().equals("Pengurus")){
                    if(username.getText().toString().equals("pengurus") && password.getText().toString().equals("pengurus")){
                        Intent i = new Intent(getActivity(), PengurusActivity.class);
                        startActivity(i);
                        ((Activity) getActivity()).overridePendingTransition(0,0);
                        //getActivity().getFragmentManager().beginTransaction().remove(LoginFragment.this).commit();
                        getActivity().finish();
                    }
                    else {
                        Toast.makeText(getActivity(), "Username atau password tidak terdaftar!", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(spinner.getSelectedItem().equals("Yayasan")) {
                    if (username.getText().toString().equals("yayasan") && password.getText().toString().equals("yayasan")) {
                        Intent i = new Intent(getActivity(), YayasanActivity.class);
                        startActivity(i);
                        ((Activity) getActivity()).overridePendingTransition(0, 0);
                        //getActivity().getFragmentManager().beginTransaction().remove(LoginFragment.this).commit();
                        getActivity().finish();
                    } else {
                        Toast.makeText(getActivity(), "Username atau password tidak terdaftar!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        Button cardSignUp = (Button) getActivity().findViewById(R.id.cardRegister);
        cardSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),SignUpActivity.class);
                startActivity(i);
            }
        });

        /*Button btnDaftar = (Button) getActivity().findViewById(R.id.btnRegister);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),SignUpActivity.class);
                startActivity(i);
            }
        });*/
    }
}
