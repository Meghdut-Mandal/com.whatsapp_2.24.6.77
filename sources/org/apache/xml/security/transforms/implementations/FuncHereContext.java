package org.apache.xml.security.transforms.implementations;

import X.C165597tg;
import X.C165607th;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.utils.I18n;
import org.apache.xpath.XPathContext;
import org.w3c.dom.Node;

public class FuncHereContext extends XPathContext {
    public FuncHereContext() {
    }

    public FuncHereContext(Node node, DTMManager dTMManager) {
        super(node);
        try {
            this.m_dtmManager = dTMManager;
        } catch (IllegalAccessError e) {
            StringBuffer A0x = C165607th.A0x();
            A0x.append(I18n.b("endorsed.jdk1.4.0"));
            A0x.append(" Original message was \"");
            A0x.append(e.getMessage());
            throw new IllegalAccessError(C165597tg.A0n("\"", A0x));
        }
    }
}
