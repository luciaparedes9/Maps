package com.example.maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera

        val berlin = LatLng(52.500,13.4050);
        val paris = LatLng(48.8566,2.3522);
        val madrid = LatLng(40.4168,3.7038);
        val kiev = LatLng(50.4501,30.5234);
        val helsinki = LatLng(60.1699,24.9384);
        val ankara = LatLng(39.9334,32.8597);
        val reykjavik = LatLng(64.1466,21.9426);



        mMap.addMarker(MarkerOptions().position(berlin).title("Marker in Berlin")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.germany))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(berlin))
        mMap.addMarker(MarkerOptions().position(paris).title("Marker in Paris")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.france))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paris))
        mMap.addMarker(MarkerOptions().position(madrid).title("Marker in Madrid")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.spain))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(madrid))
        mMap.addMarker(MarkerOptions().position(kiev).title("Marker in Kiev")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ukraine))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kiev))
        mMap.addMarker(MarkerOptions().position(helsinki).title("Marker in Helsinki")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.finland))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(helsinki))
        mMap.addMarker(MarkerOptions().position(ankara).title("Marker in Ankara")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.turkey))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ankara))
        mMap.addMarker(MarkerOptions().position(reykjavik).title("Marker in Reykjavik")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.iceland))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(reykjavik))
    }
}
