package com.example.m2tmdbapp2025.model

import com.google.gson.annotations.SerializedName


data class Person (

  @SerializedName("adult"                ) var adult              : Boolean?            = null,
  @SerializedName("gender"               ) var gender             : Int?                = null,
  @SerializedName("id"                   ) var id                 : Int?                = null,
  @SerializedName("known_for_department" ) var knownForDepartment : String?             = null,
  @SerializedName("name"                 ) var name               : String?             = null,
  @SerializedName("original_name"        ) var originalName       : String?             = null,
  @SerializedName("popularity"           ) var popularity         : Double?             = null,
  @SerializedName("profile_path"         ) var profilePath        : String?             = null,
  @SerializedName("known_for"            ) var knownFor           : ArrayList<KnownFor> = arrayListOf()

)