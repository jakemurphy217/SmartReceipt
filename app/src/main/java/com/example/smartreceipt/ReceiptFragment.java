package com.example.smartreceipt;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
// * {@link } interface
 * to handle interaction events.
 * Use the {@link ReceiptFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReceiptFragment extends Fragment {

    View v;
    //declaring recyclerview
    private RecyclerView myRecyclerView;

    //declaring receipt arraylist
    private List<Receipt> firstReceipt;


//    private  Button ButtonInert;
//    private  Button ButtonRemove;
//    private EditText EditTextInsert;
//    private EditText EditTextRemove;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    public ReceiptFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReceiptFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReceiptFragment newInstance(String param1, String param2) {
        ReceiptFragment fragment = new ReceiptFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


            //hardcoding items to the array list
            firstReceipt = new ArrayList<>();
            firstReceipt.add(new Receipt("brown thomas","€800",R.drawable.shoppingcart));
            firstReceipt.add(new Receipt("5 guys", "€15",R.drawable.fork));
            firstReceipt.add(new Receipt("pub","€50",R.drawable.beer));
            firstReceipt.add(new Receipt("brown thomas","€400",R.drawable.hangerline));
            firstReceipt.add(new Receipt("plain tickets", "€5",R.drawable.plane));
            firstReceipt.add(new Receipt("work lunch","€500",R.drawable.fork));


            //creating buttons and edit text fields to add and delete from the firstreceipt arraylist


//            ButtonInert = getView().findViewById(R.id.button_insertReceipt);
//            ButtonRemove = getView().findViewById(R.id.button_removeReceipt);
//
//            EditTextInsert = getView().findViewById(R.id.editReceipt_insert);
//            EditTextRemove = getView().findViewById(R.id.editReceipt_remove);


//            ButtonInert.setOnClickListener(new View.OnClickListener(){
//                @Override
//               public void onClick(View v){
//
//                    int position = Integer.parseInt(EditTextInsert.getText().toString());
//                    insertReceipt(position);
//
//                }
//            });
//
//            ButtonRemove.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    int position = Integer.parseInt(EditTextRemove.getText().toString());
//                    removeReceipt(position);
//                }
//            });

//    }

        //this was me trying to develop an insertreceipt class which would add items to the arraylist

//    public void insertReceipt(int position){
////
//        firstReceipt.add(position, new Receipt("college","20" + position, R.drawable.ic_android));
//        mAdapter.notifyDataSetChanged();
//    }

        // this was going to delete items from the arraylist
//
//    public void removeReceipt(int position){
//
//        firstReceipt.remove(position);
//        mAdapter.notifyDataSetChanged();
//

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_receipt,container,false);


        //recyelerview being displayed on the receipt fragment
        myRecyclerView = v.findViewById(R.id.receipt_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),firstReceipt);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);


        setHasOptionsMenu(true);






//        return inflater.inflate(R.layout.fragment_receipt, container, false);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_receipts, menu);
    }


    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }


//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
