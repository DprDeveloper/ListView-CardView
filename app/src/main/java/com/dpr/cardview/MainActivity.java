package com.dpr.cardview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ListView listado;

    String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam non leo vitae nibh " +
            "feugiat dapibus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur" +
            " ridiculus mus. Praesent vel dapibus lorem, quis iaculis orci. Etiam gravida urna nibh," +
            " vitae pharetra orci blandit mollis. Sed elementum tortor quis quam molestie pellentes" +
            "que. Fusce a molestie enim, nec sodales enim. Mauris rutrum sem ac vulputate venenatis." +
            " Sed quis tellus et sapien volutpat laoreet eget at arcu. Vivamus in dictum est";

    final ContentData[] datos =
            new ContentData[]{
                    new ContentData("Carta 1",lorem),
                    new ContentData("Carta 2",lorem),
                    new ContentData("Carta 3",lorem),
                    new ContentData("Carta 4",lorem),
                    new ContentData("Carta 5",lorem)
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        AdaptadorCardView adaptador =
                new AdaptadorCardView(this,
                        datos);

        listado = (ListView)findViewById(R.id.listView);
        listado.setAdapter(adaptador);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                Toast.makeText(getBaseContext(), "Touch corto en: "+((TextView) v.findViewById(R.id.txt1)).getText(), Toast.LENGTH_LONG).show();
            }
        });
        listado.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(), "Touch largo en: "+((TextView) view.findViewById(R.id.txt1)).getText(), Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }


}
