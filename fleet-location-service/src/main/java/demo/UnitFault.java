package demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Embeddable

public class UnitFault {

    private final String vin;
    private Long spn;
    private Long fmi;

    private UnitFault() {
        this.vin = "";
    }
}
