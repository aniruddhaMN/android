package com.example.a2b;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class itemAdapter extends ArrayAdapter<Item> {
    public itemAdapter(ArrayList<Item> data, Context context) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, View v, @NonNull ViewGroup parent){
        View curView = v;
        if (curView == null){
            curView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_row,parent,false);
        }
        final Item curItem = getItem(position);
        ((TextView)curView.findViewById(R.id.Name)).setText(curItem.getName());
        ((TextView)curView.findViewById(R.id.Price)).setText(String.valueOf(curItem.getPrice()));
        final EditText QtyET = ((EditText)curView.findViewById(R.id.Qty));
        QtyET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    curItem.setQty(Integer.parseInt(editable.toString().trim()));
                }
                catch (Exception e)
                {
                    QtyET.setText("0");
                }
            }
        });

        return curView;
    }
}
