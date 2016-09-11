package com.example.sv_2016.trashme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NewsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {
    private String[] newsHead = {"Pembuangan limbah B3 dipantau dengan GPS","Wow, 300 ponsel bekas hasilkan 10 gram emas"};
    private String[] newsDescription = {"Kementerian Lingkungan Hidup dan Kehutanan menerapkan\n" +
            "pelaporan manifes secara elektronik dan pengawasan pengangkutan secaraGPS Tracking " +
            "(SILACAK) untuk memantau pembuangan limbah bahan berbahaya dan beracun yang dilakukan " +
            "oleh perusahaan pengangkutan.\n" + "\n" +"\"Selama ini sering ada pengaduan dari " +
            "masyarakat kalau limbah berbahaya dan beracun yang diangkut oleh jasa pengangkutan " +
            "ternyata ada yang dibuang di tepi jalan sehingga merusak lingkungan dan kesehatan,\" " +
            "kata Direktur Jenderal Pengelolaan Sampah, Limbah dan Bahan Berbahaya dan Beracun (B3) " +
            "Kementerian Lingkungan Hidup dan Kehutanan (KLHK) Tuti Hendrawati Mintarsih kepada pers " +
            "usai membuka Sosialisasi Pelaksanaan Uji Coba Manifes Elektronik (FESTRONIK), di Sentul, " +
            "Jawa Barat, Kamis.","JAKARTA. Volume sampah elektronik di Indonesia dalam beberapa tahun " +
            "ke depan diperkirakan bakal terus meningkat. Maklum, pertumbuhan industri yang pesat " +
            "ditambah budaya konsumtif masyarakat dalam pemakaian barang-barang elektronik seperti " +
            "ponsel, komputer, televisi, lemari es, dan sebagainya. Lantas, barang elektronik yang " +
            "sudah tidak terpakai alias bekas nasibnya bagaimana?\n" +"Ya, kebanyakan berakhir di " +
            "tempat pembuangan sampah. Padahal, limbah barang elektronik ini sangat berbahaya karena " +
            "banyak mengandung logam berat beracun. Sayangnya, hanya sebagian limbah elektronik yang " +
            "sudah didaurulang. Sejatinya dengan teknologi pengolahan, sampah elektronik bisa " +
            "menghasilkan barang berharga seperti emas, tembaga, timah, alumunium dan sebagainya. " +
            "Director SHEQ & Operation PT Prasadha Pamunah Limbah Industri (PPLI) Syarif Hidayat " +
            "menyebutkan,  dalam PCB ponsel, komputer, dan televisi terdapat kandungan logam berharga. " +
            "\"Dari 300 ponsel bekas bisa menghasilkan 10 gram emas,\" katanya."};
    int[] newsPict = new int[]{R.drawable.news1, R.drawable.news2};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public NewsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewsFragment newInstance(String param1, String param2) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ListView newsListView = (ListView)view.findViewById(R.id.newsList);
        NewsList newsList = new NewsList(this.getActivity(), newsHead,newsDescription,newsPict);
        newsListView.setAdapter(newsList);
        return view;
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
