package org.design.lldcasestudy.pen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Refill {
    private Nib nib;
    private RefillType refillType;
}
