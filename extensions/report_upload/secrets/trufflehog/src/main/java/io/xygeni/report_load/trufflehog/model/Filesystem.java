package io.xygeni.report_load.trufflehog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter 
public class Filesystem extends SourceMetadataType {

}
