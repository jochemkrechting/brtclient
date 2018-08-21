package brtclient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inrichtingselement extends Top10nl {

  public Inrichtingselement() {
  }

  @JsonProperty("naam")
  private String naam;

  @JsonProperty("nummer")
  private int nummer;

  @JsonProperty("hoogte")
  private float hoogte;

  @JsonProperty("breedte")
  private float breedte;

  @JsonProperty("hoogteniveau")
  private int hoogteNiveau;

}
