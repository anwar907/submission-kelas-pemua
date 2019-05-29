package com.example.anwar.myrecyclerview;

import java.util.ArrayList;

public class DataValue {
    public static String[][] data = new String[][]{
            {" Atalanta BC", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/a/a8/Atalanta_Bergamo_Logo.svg/307px-Atalanta_Bergamo_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "2013-02-16"},
            {" AS Bari", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/5/5f/AS_Bari_Logo.svg/309px-AS_Bari_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "05-03-2012"},
            {"AS Olimpia Colligiana", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/9/94/AS_Olimpia_Colligiana_Logo.svg/292px-AS_Olimpia_Colligiana_Logo.svg.png", "Karya sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "2013-02-16"},
            {"AC Siena", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/d/d3/AC_Siena_Logo.svg/307px-AC_Siena_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata","05-03-2012"},
            {"GS Bogliasco D'Albertis", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/8/86/GS_Bogliasco_D%27Albertis_Logo.svg/325px-GS_Bogliasco_D%27Albertis_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "06-03-2012"},
            {"AC Prato 1908", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/8/89/AC_Prato_Logo.svg/343px-AC_Prato_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "05-03-2012"},
            {" Calcio Padova", "Liga Italia", "https://upload.wikimedia.org/wikipedia/id/thumb/archive/d/dd/20130713181734%21Calcio_Padova_Logo.svg/338px-Calcio_Padova_Logo.svg.png", "Karya Sendiri", "Tujuan penayangan file ini adalah untuk membantu pembaca mengenali produk atau layanan, meyakinkan pembaca bahwa mereka telah menemukan artikel yang tepat mengenai produk atau servis tersebut, dan menggambarkan produk atau layanan tersebut yang tidak cukup hanya digambarkan dengan kata-kata", "14-07-2013"}
    };

    public static ArrayList<Data> getListData(){
        Data data = null;
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < DataValue.data.length; i++) {
            data = new Data();
            data.setName(DataValue.data[i][0]);
            data.setRemarks(DataValue.data[i][1]);
            data.setPhoto(DataValue.data[i][2]);
            data.setDate(DataValue.data[i][3]);
            data.setWafat(DataValue.data[i][4]);
            data.setHeight(DataValue.data[i][5]);

            list.add(data);
        }

        return list;
    }
}