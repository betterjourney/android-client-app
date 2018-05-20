package com.betterjourney.android.pilot.ui.messages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.betterjourney.android.pilot.R;


public class MessagesViewFragment extends Fragment {

    String[] mUserNamesMessageData = {"BetterJourney\u2122 bot", "Foo Bar", "Neo Tzar", "Dr Strange", "Tony Stark", "Peter " +
            "Parker",
            "Andy " +
            "Dufresne", "Red Reddington", "Simply Awesome", "Shiny Tomb"};

    String[] mMessagesContentData = {"Isn't it scary that doctors call what they do \"practice\"?",
            "Jump by vow of quick, lazy strength in Oxford.",
            "How razorback jumping frogs can level six piqued gymnasts.",
            "The only true wisdom is knowing that you know nothing.",
            "Sphinx of black quartz: judge my vow.",
            "Pack my box with five dozen liquor jugs.",
            "Sixty zippers were quickly picked from the woven jute bag.",
            "Quick zephyrs blow, vexing daft Jim.",
            "Pack my box with five dozen liquor jugs",
            "Before anything else, preparation is the key to success."};


    public static MessagesViewFragment newInstance() {
        return new MessagesViewFragment();
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_messages_view, container, false);
        RecyclerView mMessageRecyclerView = rootView.findViewById(R.id.rv_messages);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL,
                false);
        mMessageRecyclerView.setLayoutManager(layoutManager);
        mMessageRecyclerView.setHasFixedSize(true);

        MessagesViewAdapter mMessagesViewAdapter = new MessagesViewAdapter(this.getActivity());
        mMessagesViewAdapter.setMessagesData(mUserNamesMessageData, mMessagesContentData);
        mMessageRecyclerView.setAdapter(mMessagesViewAdapter);

        return rootView;
    }

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    private OnFragmentInteractionListener mListener;
//
//    public MessagesViewFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment MessagesViewFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static MessagesViewFragment newInstance(String param1, String param2) {
//        MessagesViewFragment fragment = new MessagesViewFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_messages_view, container, false);
//    }
//
//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
