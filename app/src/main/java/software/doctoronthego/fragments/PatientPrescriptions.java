package software.doctoronthego.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import software.doctoronthego.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PatientPrescriptions extends Fragment {


    public PatientPrescriptions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient_prescriptions, container, false);
    }

}
