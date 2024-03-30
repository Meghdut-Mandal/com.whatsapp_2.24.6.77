package com.whatsapp.fieldstats.extension;

import X.C28991Ux;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.ArrayList;
import java.util.List;

public final class WamCallExtended extends WamCall {
    public List fields = new ArrayList();

    public void addField(WamCallExtendedField wamCallExtendedField) {
        this.fields.add(wamCallExtendedField);
    }

    public void serialize(C28991Ux r4) {
        super.serialize(r4);
        List<WamCallExtendedField> list = this.fields;
        if (list != null) {
            for (WamCallExtendedField wamCallExtendedField : list) {
                r4.Bpz(wamCallExtendedField.fieldId, wamCallExtendedField.fieldValue);
            }
        }
    }
}
