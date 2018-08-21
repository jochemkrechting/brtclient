package brtclient.entity;

import brtclient.utility.LocalDateDeserializer;
import brtclient.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Top10nl {

  Top10nl() {
  }

  @JsonProperty("eindregistratie")
  private String eindRegistratie;

  @JsonProperty("bronbeschrijving")
  private String bronBeschrijving;

  @JsonProperty("bronactualiteit")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate bronActualiteit;

  @JsonProperty("visualisatiecode")
  private int visualisatieCode;

  @JsonProperty("objectbegintijd")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate objectBeginTijd;

  @JsonProperty("bronnauwkeurigheid")
  private float bronnauwkeurigheid;

  @JsonProperty("tdncode")
  private int tdnCode;

  @JsonProperty("tijdstipregistratie")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate tijdstipRegistratie;

  @JsonProperty("identificatie")
  private String identificatie;

  @JsonProperty("objecteindtijd")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate objectEindTijd;

  @JsonProperty("brontype")
  private String bronType;

  @JsonProperty("status")
  private String status;


}
