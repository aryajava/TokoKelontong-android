package com.aryajava.tokokelontong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.aryajava.tokokelontong.fragment.AkunFragment
import com.aryajava.tokokelontong.fragment.HomeFragment
import com.aryajava.tokokelontong.fragment.KeranjangFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val fragmentHome: Fragment = HomeFragment();
    private val fragmentKeranjang: Fragment = KeranjangFragment();
    private val fragmentAkun: Fragment = AkunFragment();
    private val fm: FragmentManager = supportFragmentManager
    private var active: Fragment = fragmentHome

    private lateinit var menu:Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottonNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentKeranjang).hide(fragmentKeranjang).commit()
        fm.beginTransaction().add(R.id.container, fragmentAkun).hide(fragmentAkun).commit()

        bottonNavigationView = findViewById(R.id.nav_view)
        menu = bottonNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottonNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.navigation_home -> {
                    Log.d("Response", "Home")
                    menuItem = menu.getItem(0)
                    menuItem.isChecked = true
                    fm.beginTransaction().hide(active).show(fragmentHome).commit()
                    active = fragmentHome
                }
                R.id.navigation_keranjang -> {
                    Log.d("Response", "Keranjang")
                    menuItem = menu.getItem(1)
                    menuItem.isChecked = true
                    fm.beginTransaction().hide(active).show(fragmentKeranjang).commit()
                    active = fragmentKeranjang
                }
                R.id.navigation_akun -> {
                    Log.d("Response", "Akun")
                    menuItem = menu.getItem(2)
                    menuItem.isChecked = true
                    fm.beginTransaction().hide(active).show(fragmentAkun).commit()
                    active = fragmentAkun
                }
            }
            false
        }
    }
}