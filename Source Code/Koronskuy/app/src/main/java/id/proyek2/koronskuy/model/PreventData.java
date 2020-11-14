/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package id.proyek2.koronskuy.model;

import java.util.ArrayList;

import id.proyek2.koronskuy.R;

public class PreventData {
    private static String[] preventNames = {
            "Wash Your Hands",
            "Keep Distance",
            "Avoid Touching",
            "When Sneezing or Coughing",
            "If You Have Symptoms",
            "Wearing a Facemask"
    };

    private static String[] preventDetails = {
            "frequently, with soap and water or using an alcohol solution",
            "of at least 3 feet away from people who shows symptoms of flu, and avoid crowded places",
            "your mouth, nose, and face with your hands, as well as any potentially contamined surface like hand rails, etc",
            "cover your mouth and nose with a disposable tissue, or use your upper sleeves (not your hands!)",
            "such as cough, fever or breathing problems, don't panic! stay at home and call your doctor",
            "in public helps prevent the spread of Covid-19"
    };

    private static int[] preventImages = {
            R.drawable.prevent_satu,
            R.drawable.prevent_dua,
            R.drawable.prevent_tiga,
            R.drawable.prevent_empat,
            R.drawable.prevent_lima,
            R.drawable.prevent_enam
    };
    public static ArrayList<Prevention> getListData() {
        ArrayList<Prevention> list = new ArrayList<>();
        for (int position = 0; position < preventNames.length; position++){
            Prevention prv = new Prevention();
            prv.setName(preventNames[position]);
            prv.setDetail(preventDetails[position]);
            prv.setPhoto(preventImages[position]);
            list.add(prv);
        }
        return  list;
    }
}
