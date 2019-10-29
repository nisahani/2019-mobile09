package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    private List<SuperHero> heroList;
    public Context mContext;

    public SuperHeroAdapter(Context context, List<SuperHero> heroList) {
        this.heroList = heroList;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        //object context diambil dari parent
//        Context context = parent.getContext();
//        //object context digunakan untuk membuat object layoutInflater
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
//        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate layout ( menghubungkan adapter dengan layout )
//        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero, parent, false);
//        //object superHeroView digunakan untuk membuat object viewHolder
//        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
//        return null;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero, parent, false);
        return new MyViewHolder(superHeroView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        //ambil satu item hero
//        SuperHero hero = heroList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.heroName.setText(heroList.get(position).getHeroName());
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
        /*for non shorthand people*/
        /*if(heroList!=null){
          return heroList.size();
        }else{
          return 0;
        }*/
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView heroName;
        private ImageView gambarC;

        public MyViewHolder(View itemView) {
            super(itemView);
            //variabel disesuaikan dengan layout, karena pada layout item_super_hero terdapat satu
            //fungsi TextView = melakukan findViewById ke id layout yang bersesuaian
            heroName = itemView.findViewById(R.id.heroName);
            gambarC = (ImageView) itemView.findViewById(R.id.gambarC);
        }
    }
}
