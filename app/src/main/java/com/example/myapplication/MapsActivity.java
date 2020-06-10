package com.example.myapplication;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double lat = 55.751737;
        double lng = 37.617337;
        LatLng kreml = new LatLng(lat, lng);

        double lat1 = 55.687931;
        double lng1 = 37.771923;
        LatLng sh1 = new LatLng(lat1, lng1);

        double lat2 = 55.688550;
        double lng2 = 37.743058;
        LatLng pk1 = new LatLng(lat2, lng2);

        double lat3 = 55.690080;
        double lng3 = 37.793387;
        LatLng pk2 = new LatLng(lat3, lng3);

        double lat4 = 55.735623;
        double lng4 = 37.807254;
        LatLng zap1 = new LatLng(lat4, lng4);

        double lat5 = 55.701790;
        double lng5 = 37.568257;
        LatLng mag1 = new LatLng(lat5, lng5);

        double lat6 = 55.706508;
        double lng6 = 37.555576;
        LatLng pk3 = new LatLng(lat6, lng6);

        double lat7 = 55.700685;
        double lng7 = 37.550318;
        LatLng pk4 = new LatLng(lat7, lng7);

        double lat0 = 55.685762;
        double lng0 = 37.539026;
//        double lat0 = 55.701038;
//        double lng0 = 37.554774;
        LatLng myloc = new LatLng(lat0, lng0);

        CameraPosition cameraPosition = new CameraPosition.Builder().target(myloc).zoom(12).build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.animateCamera(cameraUpdate);
        mMap.addMarker(new MarkerOptions().position(myloc).draggable(true).title("My location"));

        mMap.addMarker(new MarkerOptions().position(kreml).title("Marker in Moscow"));
        mMap.addMarker(new MarkerOptions().position(sh1).title("paint1"));
        mMap.addMarker(new MarkerOptions().position(pk1).title("pk1"));
        mMap.addMarker(new MarkerOptions().position(pk2).title("pk2"));
        mMap.addMarker(new MarkerOptions().position(zap1).title("zap1"));
        mMap.addMarker(new MarkerOptions().position(mag1).title("mag1"));
        mMap.addMarker(new MarkerOptions().position(pk3).title("pk3"));
        mMap.addMarker(new MarkerOptions().position(pk4).title("pk4"));

        if(null != googleMap){
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(lat, lng))
                    .title("Mark")
                    .draggable(false)
            );
        }
    }

}