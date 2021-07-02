package com.aryajava.tokokelontong.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.aryajava.tokokelontong.R
import com.aryajava.tokokelontong.adapter.AdapterProduk
import com.aryajava.tokokelontong.adapter.AdapterSlider
import com.aryajava.tokokelontong.model.Produk

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    lateinit var vpSlider: ViewPager

    lateinit var rvProduk:RecyclerView
    lateinit var rvProdukBeras:RecyclerView
    lateinit var rvProdukMG:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_home, container, false)
        vpSlider = view.findViewById(R.id.vp_slider)

        rvProduk = view.findViewById(R.id.rv_product)
        rvProdukBeras = view.findViewById(R.id.rv_productBeras)
        rvProdukMG = view.findViewById(R.id.rv_productMG)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter =adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvProdukBeras.adapter = AdapterProduk(arrProdukBeras)
        rvProdukBeras.layoutManager = layoutManager2

        rvProdukMG.adapter = AdapterProduk(arrProdukMG)
        rvProdukMG.layoutManager = layoutManager3

        return view
    }
    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()

        val p1 = Produk()
        p1.nama = "Beras Raja Tawon 5Kg"
        p1.harga = "Rp. 50.000"
        p1.gambar = R.drawable.beras_rajatawon_5kg

        val p2 = Produk()
        p2.nama = "Minyak Goreng Bimoli 2 litter"
        p2.harga = "Rp. 28.000"
        p2.gambar = R.drawable.mg_bimoli_2ltr;

        val p3 = Produk()
        p3.nama = "Beras Lima Raja 5Kg"
        p3.harga = "Rp. 60.000"
        p3.gambar = R.drawable.beras_limaraja_5kg;

        val p4 = Produk()
        p4.nama = "Minyak Goreng Jujur 2 litter"
        p4.harga = "Rp. 26.000"
        p4.gambar = R.drawable.mg_jujur_2ltr;

        val p5 = Produk()
        p5.nama = "Beras Bunga 5Kg"
        p5.harga = "Rp. 50.000"
        p5.gambar = R.drawable.beras_bunga_5kg;

        val p6 = Produk()
        p6.nama = "Minyak Goreng Rosebrand 2 litter"
        p6.harga = "Rp. 28.000"
        p6.gambar = R.drawable.beras_bunga_5kg;

        val p7 = Produk()
        p7.nama = "Beras Lautan Mas 5Kg"
        p7.harga = "Rp. 50.000"
        p7.gambar = R.drawable.beras_lautanmas_5kg;

        val p8 = Produk()
        p8.nama = "Minyak Goreng Tropical 2 litter"
        p8.harga = "Rp. 28.000"
        p8.gambar = R.drawable.mg_tropical_2ltr;


        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)
        arr.add(p7)
        arr.add(p8)

        return arr
    }
    val arrProdukBeras: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Beras Tawon 5Kg"
        p1.harga = "Rp. 50.000"
        p1.gambar = R.drawable.beras_rajatawon_5kg;

        val p2 = Produk()
        p2.nama = "Beras Lima Raja 5Kg"
        p2.harga = "Rp. 60.000"
        p2.gambar = R.drawable.beras_limaraja_5kg;

        val p3 = Produk()
        p3.nama = "Beras Bunga 5Kg"
        p3.harga = "Rp. 50.000"
        p3.gambar = R.drawable.beras_bunga_5kg;

        val p4 = Produk()
        p4.nama = "Beras Lautan Mas 5Kg"
        p4.harga = "Rp. 50.000"
        p4.gambar = R.drawable.beras_lautanmas_5kg;

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)

        return arr
    }
    val arrProdukMG: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Minyak Goreng Bimoli 2 litter"
        p1.harga = "Rp. 28.000"
        p1.gambar = R.drawable.mg_bimoli_2ltr;

        val p2 = Produk()
        p2.nama = "Minyak Goreng Jujur 2 litter"
        p2.harga = "Rp. 26.000"
        p2.gambar = R.drawable.mg_jujur_2ltr;

        val p3 = Produk()
        p3.nama = "Minyak Goreng Rosebrand 2 litter"
        p3.harga = "Rp. 28.000"
        p3.gambar = R.drawable.beras_bunga_5kg;

        val p4 = Produk()
        p4.nama = "Minyak Goreng Tropical 2 litter"
        p4.harga = "Rp. 28.000"
        p4.gambar = R.drawable.mg_tropical_2ltr;

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)

        return arr
    }
}