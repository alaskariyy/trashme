package com.example.sv_2016.trashme;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by sv-2016 on 9/9/16.
 */
public class NewsSwipe extends PagerAdapter {
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
    private Context context;
    private LayoutInflater layoutInflater;

    public NewsSwipe(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsHead.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.news_list, container,false);
        TextView newsViewHead = (TextView)item_view.findViewById(R.id.newsHead);
        TextView newsViewDescription = (TextView)item_view.findViewById(R.id.newsDes);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.newsImage);
        imageView.setImageResource(newsPict[position]);
        newsViewHead.setText(newsHead[position]);
        newsViewDescription.setText(newsDescription[position]);

        container.addView(item_view);
        
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
