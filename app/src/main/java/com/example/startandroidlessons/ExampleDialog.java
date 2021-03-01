package com.example.startandroidlessons;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {
    protected EditText editTextUsername;
    protected EditText getEditTextPassword;
    private ExampleDialogListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        editTextUsername = view.findViewById(R.id.edit_username);
        getEditTextPassword = view.findViewById(R.id.edit_password);
        builder.setView(view)
                .setTitle("Login")
                .setNegativeButton("cancel", (DialogInterface dialogInterface, int i) ->{})
                .setPositiveButton("ok", (DialogInterface dialogInterface, int i) -> {
                    String userName = editTextUsername.getText().toString();
                    String userPassword = getEditTextPassword.getText().toString();
                    listener.applyTexts(userName, userPassword);
                });

        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }

    public interface ExampleDialogListener {
        void applyTexts(String username, String password);
    }
}
