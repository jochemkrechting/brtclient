package brtclient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InrichtingselementCollection {

  @JsonProperty("_links")
  Object _links;

  @JsonProperty("_embedded")
  Object _embedded;


}
