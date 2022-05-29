package com.example.washme

import com.google.android.gms.maps.model.LatLng

object Locations {
    var locations = mutableListOf<Location>(
        Location(LatLng(40.9594272468704,29.191851760152684)),
        Location(LatLng(40.960958274205176, 29.18179306371661)),
        Location(LatLng(40.95454084825199, 29.1685688914439)),
        Location(LatLng(40.96036076633348, 29.182272468002413)),
        Location(LatLng(40.95675478297286, 29.196420819173976)),
        Location(LatLng(40.94969691100026, 29.178019557489044))
    )
    fun loadLocations(latitude:Double,longitude:Double){
        locations.add(Location(LatLng(latitude,longitude)))

    }
}