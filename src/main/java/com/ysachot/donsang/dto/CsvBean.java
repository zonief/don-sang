package com.ysachot.donsang.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
public class CsvBean {

    private String locationAddress1;
    private String locationAddress2;
    private String locationCity;
    private String locationConvocationLabel;
    private String locationFullAddress;
    private boolean locationGiveBlood;
    private boolean locationGivePlasma;
    private boolean locationGivePlatelet;
    private String locationGroupCode;
    private Long locationId;
    private double locationLatitude;
    private double locationLongitude;
    private String locationName;
    private String locationPhone;
    private String locationPostCode;
    private String locationRegionCode;
    private String locationRegionName;
    private String locationSamplingLocationCode;
    private String locationHoraires;
    private String locationInfos;
    private String locationDebutInfos;
    private String locationFinInfos;
    private LocalDate collectionDate;
    private String collectionGroupCode;
    private Long collectionId;
    private String collectionIsPublic;
    private String collectionLpCode;
    private LocalTime collectionMorningEndTime;
    private LocalTime collectionMorningStartTime;
    private LocalTime collectionAfternoonEndTime;
    private LocalTime collectionAfternoonStartTime;
    private String collectionRegionCode;
    private String collectionNature;

}
