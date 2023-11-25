package com.example.androidlearning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment03 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_03,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setButton(view);
    }

    public void setButton(View view01){
      Button button5 = view01.findViewById(R.id.button5_id);
      button5.setOnClickListener(v -> {
          getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag, new Fragment02()).commit();
      });

    }
}
