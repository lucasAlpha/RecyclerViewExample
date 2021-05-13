package lucas.sampaio.leite.com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Selecao> selecoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selecoes = carregarDados();


        RecyclerView rvSelecoes = (RecyclerView) findViewById(R.id.rvSelecoes);

        SelecaoAdapter adapter = new SelecaoAdapter(selecoes, this);

        rvSelecoes.setAdapter(adapter);

//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvSelecoes.setLayoutManager(layoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvSelecoes.addItemDecoration(itemDecoration);
    }

    private List<Selecao> carregarDados(){

        List<Selecao> selecoes = new ArrayList<>();

        String[] array_selecoes = getResources().getStringArray(R.array.array_selecoes);
        String[] array_continentes = getResources().getStringArray(R.array.array_continentes);

        selecoes.add(new Selecao(array_selecoes[0], array_continentes[0], R.drawable.brasil_logo));
        selecoes.add(new Selecao(array_selecoes[1], array_continentes[0], R.drawable.argentina_logo));
        selecoes.add(new Selecao(array_selecoes[2], array_continentes[1], R.drawable.alemanha_logo));

        return selecoes;
    }
}