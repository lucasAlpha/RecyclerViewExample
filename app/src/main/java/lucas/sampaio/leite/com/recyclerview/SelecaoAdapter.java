package lucas.sampaio.leite.com.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelecaoAdapter extends RecyclerView.Adapter<SelecaoAdapter.ViewHolder> {

    private List<Selecao> selecoes;
    private Context context;

    public SelecaoAdapter(List<Selecao> selecoes, Context context) {
        this.selecoes = selecoes;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View selecaoView = inflater.inflate(R.layout.layout_item_personalizado, parent, false);

        ViewHolder viewHolder = new ViewHolder(selecaoView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Selecao selecao = selecoes.get(position);

        TextView textViewNome = holder.textViewNome;
        textViewNome.setText(selecao.getNome());
        TextView textViewContinente = holder.textViewContinente;
        textViewContinente.setText(selecao.getContinente());
        ImageView escudo = holder.imageView;
        escudo.setImageResource(selecao.getImage());

    }

    @Override
    public int getItemCount() {
        return selecoes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView textViewNome;
        public TextView textViewContinente;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNome = (TextView) itemView.findViewById(R.id.item_personalizado_textView_selecao);
            textViewContinente = (TextView) itemView.findViewById(R.id.item_personalizado_textView_continente);
            imageView = (ImageView) itemView.findViewById(R.id.item_personalizado_imageView_escudo);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            if(position != RecyclerView.NO_POSITION){
                Selecao selecao = selecoes.get(position);

                Toast.makeText(context, selecao.getNome(), Toast.LENGTH_LONG).show();
            }

        }
    }
}
