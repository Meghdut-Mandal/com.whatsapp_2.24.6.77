package org.spongycastle.jcajce.provider.symmetric;

import X.AXJ;
import X.AnonymousClass000;
import X.AnonymousClass11m;
import X.AnonymousClass11u;
import X.AnonymousClass121;
import X.AnonymousClass122;
import X.AnonymousClass124;
import X.AnonymousClass12B;
import X.AnonymousClass12I;
import X.B35;
import X.B3H;
import X.C165567td;
import X.C165617ti;
import X.C16590pl;
import X.C195349Tx;
import X.C200149gj;
import X.C200749i9;
import X.C201939kk;
import X.C21752AZg;
import X.C21762AZu;
import X.C21765AZy;
import X.C21766AZz;
import X.C21768Aa1;
import X.C21769Aa2;
import X.C21770Aa3;
import X.C21771Aa4;
import X.C21774Aa7;
import X.C21786AaJ;
import X.C21860Abk;
import X.C21861Abl;
import X.C21907Acd;
import X.C21908Ace;
import X.C21909Acf;
import X.C21910Acg;
import X.C21911Ach;
import X.C22622Aro;
import X.C22623Arp;
import X.C22644AsA;
import X.C22656AsM;
import X.C22659AsP;
import X.C22695Asz;
import X.C22696At0;
import X.C22704At8;
import X.C22705At9;
import X.C22717AtL;
import X.C22724AuR;
import X.C22725Aud;
import X.C23130B6l;
import X.C90494aF;
import X.C90514aH;
import X.C90524aI;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;

public final class AES {
    public static final Map A00;

    public class Mappings extends AnonymousClass11u {
        public static final String A00 = AES.class.getName();

        public void A02(AnonymousClass11m r37) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            sb.append(str);
            sb.append("$AlgParams");
            AnonymousClass11m r11 = r37;
            r11.B0F("AlgorithmParameters.AES", sb.toString());
            r11.B0F("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            r11.B0F("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            r11.B0F("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r35 = AnonymousClass12B.A08;
            sb2.append(r35);
            r11.B0F(sb2.toString(), "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r34 = AnonymousClass12B.A0G;
            sb3.append(r34);
            r11.B0F(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r33 = AnonymousClass12B.A0O;
            sb4.append(r33);
            r11.B0F(sb4.toString(), "AES");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamsGCM");
            r11.B0F("AlgorithmParameters.GCM", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r32 = AnonymousClass12B.A0C;
            sb6.append(r32);
            r11.B0F(sb6.toString(), "GCM");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r31 = AnonymousClass12B.A0K;
            sb7.append(r31);
            r11.B0F(sb7.toString(), "GCM");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r6 = AnonymousClass12B.A0S;
            sb8.append(r6);
            r11.B0F(sb8.toString(), "GCM");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append("$AlgParamsCCM");
            r11.B0F("AlgorithmParameters.CCM", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r3 = AnonymousClass12B.A09;
            sb10.append(r3);
            r11.B0F(sb10.toString(), "CCM");
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r2 = AnonymousClass12B.A0H;
            sb11.append(r2);
            r11.B0F(sb11.toString(), "CCM");
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Alg.Alias.AlgorithmParameters.");
            AnonymousClass122 r1 = AnonymousClass12B.A0P;
            sb12.append(r1);
            r11.B0F(sb12.toString(), "CCM");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append("$AlgParamGen");
            r11.B0F("AlgorithmParameterGenerator.AES", sb13.toString());
            r11.B0F("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            r11.B0F("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            r11.B0F("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb14.append(r35);
            r11.B0F(sb14.toString(), "AES");
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb15.append(r34);
            r11.B0F(sb15.toString(), "AES");
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb16.append(r33);
            r11.B0F(sb16.toString(), "AES");
            Map map = AES.A00;
            r11.B0H("Cipher.AES", map);
            StringBuilder sb17 = new StringBuilder();
            sb17.append(str);
            sb17.append("$ECB");
            r11.B0F("Cipher.AES", sb17.toString());
            r11.B0F("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            r11.B0F("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            r11.B0F("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            AnonymousClass122 r30 = AnonymousClass12B.A0B;
            StringBuilder sb18 = new StringBuilder();
            sb18.append(str);
            sb18.append("$ECB");
            r11.B0G("Cipher", sb18.toString(), r30);
            AnonymousClass122 r29 = AnonymousClass12B.A0J;
            StringBuilder sb19 = new StringBuilder();
            sb19.append(str);
            sb19.append("$ECB");
            r11.B0G("Cipher", sb19.toString(), r29);
            AnonymousClass122 r28 = AnonymousClass12B.A0R;
            StringBuilder sb20 = new StringBuilder();
            sb20.append(str);
            sb20.append("$ECB");
            r11.B0G("Cipher", sb20.toString(), r28);
            StringBuilder sb21 = new StringBuilder();
            sb21.append(str);
            sb21.append("$CBC");
            r11.B0G("Cipher", sb21.toString(), r35);
            StringBuilder sb22 = new StringBuilder();
            sb22.append(str);
            sb22.append("$CBC");
            r11.B0G("Cipher", sb22.toString(), r34);
            StringBuilder sb23 = new StringBuilder();
            sb23.append(str);
            sb23.append("$CBC");
            r11.B0G("Cipher", sb23.toString(), r33);
            AnonymousClass122 r27 = AnonymousClass12B.A0D;
            StringBuilder sb24 = new StringBuilder();
            sb24.append(str);
            sb24.append("$OFB");
            r11.B0G("Cipher", sb24.toString(), r27);
            AnonymousClass122 r26 = AnonymousClass12B.A0L;
            StringBuilder sb25 = new StringBuilder();
            sb25.append(str);
            sb25.append("$OFB");
            r11.B0G("Cipher", sb25.toString(), r26);
            AnonymousClass122 r25 = AnonymousClass12B.A0T;
            StringBuilder sb26 = new StringBuilder();
            sb26.append(str);
            sb26.append("$OFB");
            r11.B0G("Cipher", sb26.toString(), r25);
            AnonymousClass122 r24 = AnonymousClass12B.A0A;
            StringBuilder sb27 = new StringBuilder();
            sb27.append(str);
            sb27.append("$CFB");
            r11.B0G("Cipher", sb27.toString(), r24);
            AnonymousClass122 r23 = AnonymousClass12B.A0I;
            StringBuilder sb28 = new StringBuilder();
            sb28.append(str);
            sb28.append("$CFB");
            r11.B0G("Cipher", sb28.toString(), r23);
            AnonymousClass122 r22 = AnonymousClass12B.A0Q;
            StringBuilder sb29 = new StringBuilder();
            sb29.append(str);
            sb29.append("$CFB");
            r11.B0G("Cipher", sb29.toString(), r22);
            r11.B0H("Cipher.AESWRAP", map);
            StringBuilder sb30 = new StringBuilder();
            sb30.append(str);
            sb30.append("$Wrap");
            r11.B0F("Cipher.AESWRAP", sb30.toString());
            AnonymousClass122 r21 = AnonymousClass12B.A0E;
            r11.B0G("Alg.Alias.Cipher", "AESWRAP", r21);
            AnonymousClass122 r20 = AnonymousClass12B.A0M;
            r11.B0G("Alg.Alias.Cipher", "AESWRAP", r20);
            AnonymousClass122 r19 = AnonymousClass12B.A0U;
            r11.B0G("Alg.Alias.Cipher", "AESWRAP", r19);
            r11.B0F("Alg.Alias.Cipher.AESKW", "AESWRAP");
            r11.B0H("Cipher.AESWRAPPAD", map);
            StringBuilder sb31 = new StringBuilder();
            sb31.append(str);
            sb31.append("$WrapPad");
            r11.B0F("Cipher.AESWRAPPAD", sb31.toString());
            AnonymousClass122 r18 = AnonymousClass12B.A0F;
            r11.B0G("Alg.Alias.Cipher", "AESWRAPPAD", r18);
            AnonymousClass122 r17 = AnonymousClass12B.A0N;
            r11.B0G("Alg.Alias.Cipher", "AESWRAPPAD", r17);
            AnonymousClass122 r16 = AnonymousClass12B.A0V;
            r11.B0G("Alg.Alias.Cipher", "AESWRAPPAD", r16);
            r11.B0F("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str);
            sb32.append("$RFC3211Wrap");
            r11.B0F("Cipher.AESRFC3211WRAP", sb32.toString());
            StringBuilder sb33 = new StringBuilder();
            sb33.append(str);
            sb33.append("$RFC5649Wrap");
            r11.B0F("Cipher.AESRFC5649WRAP", sb33.toString());
            StringBuilder sb34 = new StringBuilder();
            sb34.append(str);
            sb34.append("$AlgParamGenCCM");
            r11.B0F("AlgorithmParameterGenerator.CCM", sb34.toString());
            StringBuilder sb35 = new StringBuilder();
            sb35.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb35.append(r3);
            r11.B0F(sb35.toString(), "CCM");
            StringBuilder sb36 = new StringBuilder();
            sb36.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb36.append(r2);
            r11.B0F(sb36.toString(), "CCM");
            StringBuilder sb37 = new StringBuilder();
            sb37.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb37.append(r1);
            r11.B0F(sb37.toString(), "CCM");
            r11.B0H("Cipher.CCM", map);
            StringBuilder sb38 = new StringBuilder();
            sb38.append(str);
            sb38.append("$CCM");
            r11.B0F("Cipher.CCM", sb38.toString());
            r11.B0G("Alg.Alias.Cipher", "CCM", r3);
            r11.B0G("Alg.Alias.Cipher", "CCM", r2);
            r11.B0G("Alg.Alias.Cipher", "CCM", r1);
            StringBuilder sb39 = new StringBuilder();
            sb39.append(str);
            sb39.append("$AlgParamGenGCM");
            r11.B0F("AlgorithmParameterGenerator.GCM", sb39.toString());
            StringBuilder sb40 = new StringBuilder();
            sb40.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb40.append(r32);
            r11.B0F(sb40.toString(), "GCM");
            StringBuilder sb41 = new StringBuilder();
            sb41.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb41.append(r31);
            r11.B0F(sb41.toString(), "GCM");
            StringBuilder sb42 = new StringBuilder();
            sb42.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb42.append(r6);
            r11.B0F(sb42.toString(), "GCM");
            r11.B0H("Cipher.GCM", map);
            StringBuilder sb43 = new StringBuilder();
            sb43.append(str);
            sb43.append("$GCM");
            r11.B0F("Cipher.GCM", sb43.toString());
            r11.B0G("Alg.Alias.Cipher", "GCM", r32);
            r11.B0G("Alg.Alias.Cipher", "GCM", r31);
            r11.B0G("Alg.Alias.Cipher", "GCM", r6);
            StringBuilder sb44 = new StringBuilder();
            sb44.append(str);
            sb44.append("$KeyGen");
            r11.B0F("KeyGenerator.AES", sb44.toString());
            StringBuilder sb45 = new StringBuilder();
            sb45.append(str);
            sb45.append("$KeyGen128");
            r11.B0F("KeyGenerator.2.16.840.1.101.3.4.2", sb45.toString());
            StringBuilder sb46 = new StringBuilder();
            sb46.append(str);
            sb46.append("$KeyGen192");
            r11.B0F("KeyGenerator.2.16.840.1.101.3.4.22", sb46.toString());
            StringBuilder sb47 = new StringBuilder();
            sb47.append(str);
            sb47.append("$KeyGen256");
            r11.B0F("KeyGenerator.2.16.840.1.101.3.4.42", sb47.toString());
            StringBuilder sb48 = new StringBuilder();
            sb48.append(str);
            sb48.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb48.toString(), r30);
            StringBuilder sb49 = new StringBuilder();
            sb49.append(str);
            sb49.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb49.toString(), r35);
            StringBuilder sb50 = new StringBuilder();
            sb50.append(str);
            sb50.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb50.toString(), r27);
            StringBuilder sb51 = new StringBuilder();
            sb51.append(str);
            sb51.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb51.toString(), r24);
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str);
            sb52.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb52.toString(), r29);
            StringBuilder sb53 = new StringBuilder();
            sb53.append(str);
            sb53.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb53.toString(), r34);
            StringBuilder sb54 = new StringBuilder();
            sb54.append(str);
            sb54.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb54.toString(), r26);
            StringBuilder sb55 = new StringBuilder();
            sb55.append(str);
            sb55.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb55.toString(), r23);
            StringBuilder sb56 = new StringBuilder();
            sb56.append(str);
            sb56.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb56.toString(), r28);
            StringBuilder sb57 = new StringBuilder();
            sb57.append(str);
            sb57.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb57.toString(), r33);
            StringBuilder sb58 = new StringBuilder();
            sb58.append(str);
            sb58.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb58.toString(), r25);
            StringBuilder sb59 = new StringBuilder();
            sb59.append(str);
            sb59.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb59.toString(), r22);
            StringBuilder sb60 = new StringBuilder();
            sb60.append(str);
            sb60.append("$KeyGen");
            r11.B0F("KeyGenerator.AESWRAP", sb60.toString());
            StringBuilder sb61 = new StringBuilder();
            sb61.append(str);
            sb61.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb61.toString(), r21);
            StringBuilder sb62 = new StringBuilder();
            sb62.append(str);
            sb62.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb62.toString(), r20);
            StringBuilder sb63 = new StringBuilder();
            sb63.append(str);
            sb63.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb63.toString(), r19);
            StringBuilder sb64 = new StringBuilder();
            sb64.append(str);
            sb64.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb64.toString(), r32);
            StringBuilder sb65 = new StringBuilder();
            sb65.append(str);
            sb65.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb65.toString(), r31);
            StringBuilder sb66 = new StringBuilder();
            sb66.append(str);
            sb66.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb66.toString(), r6);
            StringBuilder sb67 = new StringBuilder();
            sb67.append(str);
            sb67.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb67.toString(), r3);
            StringBuilder sb68 = new StringBuilder();
            sb68.append(str);
            sb68.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb68.toString(), r2);
            StringBuilder sb69 = new StringBuilder();
            sb69.append(str);
            sb69.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb69.toString(), r1);
            StringBuilder sb70 = new StringBuilder();
            sb70.append(str);
            sb70.append("$KeyGen");
            r11.B0F("KeyGenerator.AESWRAPPAD", sb70.toString());
            StringBuilder sb71 = new StringBuilder();
            sb71.append(str);
            sb71.append("$KeyGen128");
            r11.B0G("KeyGenerator", sb71.toString(), r18);
            StringBuilder sb72 = new StringBuilder();
            sb72.append(str);
            sb72.append("$KeyGen192");
            r11.B0G("KeyGenerator", sb72.toString(), r17);
            StringBuilder sb73 = new StringBuilder();
            sb73.append(str);
            sb73.append("$KeyGen256");
            r11.B0G("KeyGenerator", sb73.toString(), r16);
            StringBuilder sb74 = new StringBuilder();
            sb74.append(str);
            sb74.append("$AESCMAC");
            r11.B0F("Mac.AESCMAC", sb74.toString());
            StringBuilder sb75 = new StringBuilder();
            sb75.append(str);
            sb75.append("$AESCCMMAC");
            r11.B0F("Mac.AESCCMMAC", sb75.toString());
            StringBuilder sb76 = new StringBuilder();
            sb76.append("Alg.Alias.Mac.");
            sb76.append(r3.A01);
            r11.B0F(sb76.toString(), "AESCCMMAC");
            StringBuilder sb77 = new StringBuilder();
            sb77.append("Alg.Alias.Mac.");
            sb77.append(r2.A01);
            r11.B0F(sb77.toString(), "AESCCMMAC");
            StringBuilder sb78 = new StringBuilder();
            sb78.append("Alg.Alias.Mac.");
            sb78.append(r1.A01);
            r11.B0F(sb78.toString(), "AESCCMMAC");
            AnonymousClass122 r212 = AnonymousClass12I.A06;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            AnonymousClass122 r202 = AnonymousClass12I.A07;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            AnonymousClass122 r192 = AnonymousClass12I.A08;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            AnonymousClass122 r182 = AnonymousClass12I.A0D;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            AnonymousClass122 r172 = AnonymousClass12I.A0E;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            AnonymousClass122 r210 = AnonymousClass12I.A0F;
            r11.B0G("Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            StringBuilder sb79 = new StringBuilder();
            sb79.append(str);
            sb79.append("$PBEWithSHA1AESCBC128");
            r11.B0F("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", sb79.toString());
            StringBuilder sb80 = new StringBuilder();
            sb80.append(str);
            sb80.append("$PBEWithSHA1AESCBC192");
            r11.B0F("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", sb80.toString());
            StringBuilder sb81 = new StringBuilder();
            sb81.append(str);
            sb81.append("$PBEWithSHA1AESCBC256");
            r11.B0F("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", sb81.toString());
            StringBuilder sb82 = new StringBuilder();
            sb82.append(str);
            sb82.append("$PBEWithSHA256AESCBC128");
            r11.B0F("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", sb82.toString());
            StringBuilder sb83 = new StringBuilder();
            sb83.append(str);
            sb83.append("$PBEWithSHA256AESCBC192");
            r11.B0F("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", sb83.toString());
            StringBuilder sb84 = new StringBuilder();
            sb84.append(str);
            sb84.append("$PBEWithSHA256AESCBC256");
            r11.B0F("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", sb84.toString());
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb85 = new StringBuilder();
            sb85.append(str);
            sb85.append("$PBEWithAESCBC");
            r11.B0F("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb85.toString());
            StringBuilder sb86 = new StringBuilder();
            sb86.append(str);
            sb86.append("$PBEWithAESCBC");
            r11.B0F("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb86.toString());
            StringBuilder sb87 = new StringBuilder();
            sb87.append(str);
            sb87.append("$PBEWithAESCBC");
            r11.B0F("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb87.toString());
            StringBuilder sb88 = new StringBuilder();
            sb88.append(str);
            sb88.append("$KeyFactory");
            r11.B0F("SecretKeyFactory.AES", sb88.toString());
            AnonymousClass122 r162 = AnonymousClass12B.A00;
            StringBuilder sb89 = new StringBuilder();
            sb89.append(str);
            sb89.append("$KeyFactory");
            r11.B0G("SecretKeyFactory", sb89.toString(), r162);
            StringBuilder sb90 = new StringBuilder();
            sb90.append(str);
            sb90.append("$PBEWithMD5And128BitAESCBCOpenSSL");
            r11.B0F("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb90.toString());
            StringBuilder sb91 = new StringBuilder();
            sb91.append(str);
            sb91.append("$PBEWithMD5And192BitAESCBCOpenSSL");
            r11.B0F("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb91.toString());
            StringBuilder sb92 = new StringBuilder();
            sb92.append(str);
            sb92.append("$PBEWithMD5And256BitAESCBCOpenSSL");
            r11.B0F("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb92.toString());
            StringBuilder sb93 = new StringBuilder();
            sb93.append(str);
            sb93.append("$PBEWithSHAAnd128BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", sb93.toString());
            StringBuilder sb94 = new StringBuilder();
            sb94.append(str);
            sb94.append("$PBEWithSHAAnd192BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", sb94.toString());
            StringBuilder sb95 = new StringBuilder();
            sb95.append(str);
            sb95.append("$PBEWithSHAAnd256BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", sb95.toString());
            StringBuilder sb96 = new StringBuilder();
            sb96.append(str);
            sb96.append("$PBEWithSHA256And128BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", sb96.toString());
            StringBuilder sb97 = new StringBuilder();
            sb97.append(str);
            sb97.append("$PBEWithSHA256And192BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", sb97.toString());
            StringBuilder sb98 = new StringBuilder();
            sb98.append(str);
            sb98.append("$PBEWithSHA256And256BitAESBC");
            r11.B0F("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", sb98.toString());
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.B0F("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            r11.B0G("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.B0F("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            StringBuilder sb99 = new StringBuilder();
            sb99.append("Alg.Alias.AlgorithmParameters.");
            sb99.append(r212.A01);
            r11.B0F(sb99.toString(), "PKCS12PBE");
            StringBuilder sb100 = new StringBuilder();
            sb100.append("Alg.Alias.AlgorithmParameters.");
            sb100.append(r202.A01);
            r11.B0F(sb100.toString(), "PKCS12PBE");
            StringBuilder sb101 = new StringBuilder();
            sb101.append("Alg.Alias.AlgorithmParameters.");
            sb101.append(r192.A01);
            r11.B0F(sb101.toString(), "PKCS12PBE");
            StringBuilder sb102 = new StringBuilder();
            sb102.append("Alg.Alias.AlgorithmParameters.");
            sb102.append(r182.A01);
            r11.B0F(sb102.toString(), "PKCS12PBE");
            StringBuilder sb103 = new StringBuilder();
            sb103.append("Alg.Alias.AlgorithmParameters.");
            sb103.append(r172.A01);
            r11.B0F(sb103.toString(), "PKCS12PBE");
            StringBuilder sb104 = new StringBuilder();
            sb104.append("Alg.Alias.AlgorithmParameters.");
            sb104.append(r210.A01);
            r11.B0F(sb104.toString(), "PKCS12PBE");
            StringBuilder sb105 = new StringBuilder();
            sb105.append(str);
            sb105.append("$AESGMAC");
            String obj = sb105.toString();
            StringBuilder sb106 = new StringBuilder();
            sb106.append(str);
            sb106.append("$KeyGen128");
            String obj2 = sb106.toString();
            StringBuilder sb107 = new StringBuilder();
            sb107.append("Mac.");
            sb107.append("AES");
            sb107.append("-GMAC");
            r11.B0F(sb107.toString(), obj);
            StringBuilder sb108 = new StringBuilder();
            sb108.append("Alg.Alias.Mac.");
            sb108.append("AES");
            sb108.append("GMAC");
            String obj3 = sb108.toString();
            StringBuilder sb109 = new StringBuilder();
            sb109.append("AES");
            sb109.append("-GMAC");
            r11.B0F(obj3, sb109.toString());
            StringBuilder sb110 = new StringBuilder();
            sb110.append("KeyGenerator.");
            sb110.append("AES");
            sb110.append("-GMAC");
            r11.B0F(sb110.toString(), obj2);
            StringBuilder sb111 = new StringBuilder();
            sb111.append("Alg.Alias.KeyGenerator.");
            sb111.append("AES");
            sb111.append("GMAC");
            String obj4 = sb111.toString();
            StringBuilder sb112 = new StringBuilder();
            sb112.append("AES");
            sb112.append("-GMAC");
            r11.B0F(obj4, sb112.toString());
            StringBuilder sb113 = new StringBuilder();
            sb113.append(str);
            sb113.append("$Poly1305");
            String obj5 = sb113.toString();
            StringBuilder sb114 = new StringBuilder();
            sb114.append(str);
            sb114.append("$Poly1305KeyGen");
            String obj6 = sb114.toString();
            StringBuilder sb115 = new StringBuilder();
            sb115.append("Mac.POLY1305-");
            sb115.append("AES");
            r11.B0F(sb115.toString(), obj5);
            StringBuilder sb116 = new StringBuilder();
            sb116.append("Alg.Alias.Mac.POLY1305");
            sb116.append("AES");
            String obj7 = sb116.toString();
            StringBuilder sb117 = new StringBuilder();
            sb117.append("POLY1305-");
            sb117.append("AES");
            r11.B0F(obj7, sb117.toString());
            StringBuilder sb118 = new StringBuilder();
            sb118.append("KeyGenerator.POLY1305-");
            sb118.append("AES");
            r11.B0F(sb118.toString(), obj6);
            StringBuilder sb119 = new StringBuilder();
            sb119.append("Alg.Alias.KeyGenerator.POLY1305");
            sb119.append("AES");
            String obj8 = sb119.toString();
            StringBuilder sb120 = new StringBuilder();
            sb120.append("POLY1305-");
            sb120.append("AES");
            r11.B0F(obj8, sb120.toString());
        }
    }

    public class AESCCMMAC extends C21909Acf {

        public class CCMMac implements B3H {
            public int A00 = 8;
            public final C21771Aa4 A01 = new C21771Aa4(new C21752AZg());

            public int BDk() {
                return this.A00;
            }

            public void BKO(C16590pl r3) {
                C21771Aa4 aa4 = this.A01;
                aa4.BKQ(r3, true);
                this.A00 = aa4.BDj().length;
            }

            public void update(byte[] bArr, int i, int i2) {
                this.A01.BmL(bArr, i, i2);
            }

            public int B5n(byte[] bArr, int i) {
                try {
                    return this.A01.B5n(bArr, 0);
                } catch (C22696At0 e) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    throw AnonymousClass000.A0g(C90494aF.A0c(e, "exception on doFinal(): ", A0u), A0u);
                }
            }

            public void BwT(byte b) {
                this.A01.A04.write(b);
            }

            public void reset() {
                C21771Aa4 aa4 = this.A01;
                aa4.A02.reset();
                aa4.A04.reset();
                aa4.A05.reset();
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public class AESCMAC extends C21909Acf {
        public AESCMAC() {
            super(new C21765AZy(new C21752AZg()));
        }
    }

    public class AESGMAC extends C21909Acf {
        public AESGMAC() {
            super(new C21762AZu(new C21774Aa7(new C21752AZg())));
        }
    }

    public class AlgParamGen extends C21860Abk {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = C201939kk.A00();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("AES", ((C21786AaJ) this.A01).A00);
                instance.init(new IvParameterSpec(bArr));
                return instance;
            } catch (Exception e) {
                throw C90514aH.A0s(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw C165617ti.A0c("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenCCM extends C21860Abk {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("CCM", ((C21786AaJ) this.A01).A00);
                instance.init(new C22622Aro(bArr, 12).A08());
                return instance;
            } catch (Exception e) {
                throw C90514aH.A0s(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw C165617ti.A0c("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenGCM extends C21860Abk {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("GCM", ((C21786AaJ) this.A01).A00);
                instance.init(new C22623Arp(bArr, 16).A08());
                return instance;
            } catch (Exception e) {
                throw C90514aH.A0s(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw C165617ti.A0c("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class CCM extends C22724AuR {
        public CCM() {
            super((C23130B6l) new C21771Aa4(new C21752AZg()), 12, false);
        }
    }

    public class CFB extends C22724AuR {
        public CFB() {
            super(new C200149gj(new C22705At9(new C21752AZg(), 128)));
        }
    }

    public class ECB extends C22724AuR {
        public ECB() {
            super(new Object() {
            });
        }
    }

    public class GCM extends C22724AuR {
        public GCM() {
            super((C23130B6l) new C21774Aa7(new C21752AZg()));
        }
    }

    public class KeyFactory extends C21910Acg {
        public KeyFactory() {
            super("AES", (AnonymousClass122) null);
        }
    }

    public class KeyGen extends C21908Ace {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", new C195349Tx(), i);
        }
    }

    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public class OFB extends C22724AuR {
        public OFB() {
            super(new C200149gj(new C22704At8(new C21752AZg(), 128)));
        }
    }

    public class PBEWithMD5And128BitAESCBCOpenSSL extends C22725Aud {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", 3, 0, 128, 128, true);
        }
    }

    public class PBEWithMD5And192BitAESCBCOpenSSL extends C22725Aud {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", 3, 0, 192, 128, true);
        }
    }

    public class PBEWithMD5And256BitAESCBCOpenSSL extends C22725Aud {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", 3, 0, 256, 128, true);
        }
    }

    public class PBEWithSHA256And128BitAESBC extends C22725Aud {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", 2, 4, 128, 128, true);
        }
    }

    public class PBEWithSHA256And192BitAESBC extends C22725Aud {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", 2, 4, 192, 128, true);
        }
    }

    public class PBEWithSHA256And256BitAESBC extends C22725Aud {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", 2, 4, 256, 128, true);
        }
    }

    public class PBEWithSHAAnd128BitAESBC extends C22725Aud {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", 2, 1, 128, 128, true);
        }
    }

    public class PBEWithSHAAnd192BitAESBC extends C22725Aud {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", 2, 1, 192, 128, true);
        }
    }

    public class PBEWithSHAAnd256BitAESBC extends C22725Aud {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", 2, 1, 256, 128, true);
        }
    }

    public class Poly1305 extends C21909Acf {
        public Poly1305() {
            super(new C21766AZz(new C21752AZg()));
        }
    }

    public class Poly1305KeyGen extends C21908Ace {
        public Poly1305KeyGen() {
            super("Poly1305-AES", new C22695Asz(), 256);
        }
    }

    public class RFC3211Wrap extends C21907Acd {
        public RFC3211Wrap() {
            super(new C21769Aa2(new C21752AZg()), 16);
        }
    }

    public class RFC5649Wrap extends C21907Acd {
        public RFC5649Wrap() {
            super(new C21770Aa3(new C21752AZg()), 0);
        }
    }

    public class Wrap extends C21907Acd {
        public Wrap() {
            super(new C21768Aa1(), 0);
        }
    }

    public class WrapPad extends C21907Acd {
        public WrapPad() {
            super(new C22717AtL(), 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }

    public class AlgParams extends C21861Abl {
        public byte[] A00;

        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public byte[] engineGetEncoded(String str) {
            if (C21861Abl.A00(str)) {
                return new C22644AsA(engineGetEncoded("RAW")).A08();
            }
            if (str.equals("RAW")) {
                return AnonymousClass124.A02(this.A00);
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.A00 = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }

        public String engineToString() {
            return "AES IV";
        }

        public void engineInit(byte[] bArr, String str) {
            if (C21861Abl.A00(str)) {
                try {
                    engineInit(((C22659AsP) AnonymousClass121.A00(bArr)).A00);
                } catch (Exception e) {
                    throw C90524aI.A0X(AnonymousClass000.A0l(e, "Exception decoding: ", AnonymousClass000.A0u()));
                }
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw C90524aI.A0X("Unknown parameters format in IV parameters object");
            }
        }

        public void engineInit(byte[] bArr) {
            int length = bArr.length;
            if (length % 8 != 0 && bArr[0] == 4 && bArr[1] == length - 2) {
                bArr = ((C22659AsP) AnonymousClass121.A00(bArr)).A00;
            }
            this.A00 = AnonymousClass124.A02(bArr);
        }
    }

    public class AlgParamsCCM extends C21861Abl {
        public C22622Aro A00;

        public byte[] engineGetEncoded() {
            return this.A00.A08();
        }

        public String engineToString() {
            return "CCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (C21861Abl.A00(str)) {
                return this.A00.A08();
            }
            throw C90524aI.A0X("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            C22622Aro aro;
            if (C21861Abl.A00(str)) {
                if (bArr instanceof C22622Aro) {
                    aro = (C22622Aro) bArr;
                } else if (bArr != null) {
                    aro = new C22622Aro(C22656AsM.A04(bArr));
                } else {
                    aro = null;
                }
                this.A00 = aro;
                return;
            }
            throw C90524aI.A0X("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C22622Aro aro;
            Class cls = C200749i9.A02;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    C22623Arp arp = (C22623Arp) AccessController.doPrivileged(new AXJ(algorithmParameterSpec));
                    if (arp != null) {
                        aro = new C22622Aro(C22656AsM.A04(arp));
                    } else {
                        aro = null;
                    }
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C21911Ach) {
                C21911Ach ach = (C21911Ach) algorithmParameterSpec;
                aro = new C22622Aro(ach.getIV(), ach.A00 / 8);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1N(algorithmParameterSpec, "AlgorithmParameterSpec class not recognized: ", A0u);
                throw new InvalidParameterSpecException(A0u.toString());
            }
            this.A00 = aro;
        }

        public void engineInit(byte[] bArr) {
            C22622Aro aro;
            if (bArr instanceof C22622Aro) {
                aro = (C22622Aro) bArr;
            } else if (bArr != null) {
                aro = new C22622Aro(C22656AsM.A04(bArr));
            } else {
                aro = null;
            }
            this.A00 = aro;
        }
    }

    public class AlgParamsGCM extends C21861Abl {
        public C22623Arp A00;

        public byte[] engineGetEncoded() {
            return this.A00.A08();
        }

        public String engineToString() {
            return "GCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (C21861Abl.A00(str)) {
                return this.A00.A08();
            }
            throw C90524aI.A0X("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            C22623Arp arp;
            if (C21861Abl.A00(str)) {
                if (bArr instanceof C22623Arp) {
                    arp = (C22623Arp) bArr;
                } else if (bArr != null) {
                    arp = new C22623Arp(C22656AsM.A04(bArr));
                } else {
                    arp = null;
                }
                this.A00 = arp;
                return;
            }
            throw C90524aI.A0X("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C22623Arp arp;
            Class cls = C200749i9.A02;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    arp = (C22623Arp) AccessController.doPrivileged(new AXJ(algorithmParameterSpec));
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C21911Ach) {
                C21911Ach ach = (C21911Ach) algorithmParameterSpec;
                arp = new C22623Arp(ach.getIV(), ach.A00 / 8);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1N(algorithmParameterSpec, "AlgorithmParameterSpec class not recognized: ", A0u);
                throw new InvalidParameterSpecException(A0u.toString());
            }
            this.A00 = arp;
        }

        public void engineInit(byte[] bArr) {
            C22623Arp arp;
            if (bArr instanceof C22623Arp) {
                arp = (C22623Arp) bArr;
            } else if (bArr != null) {
                arp = new C22623Arp(C22656AsM.A04(bArr));
            } else {
                arp = null;
            }
            this.A00 = arp;
        }
    }

    public class CBC extends C22724AuR {
        public CBC() {
            super(C21907Acd.A00(), 128);
        }
    }

    public class PBEWithAESCBC extends C22724AuR {
        public PBEWithAESCBC() {
            super((B35) C21907Acd.A00());
        }
    }

    public class PBEWithSHA1AESCBC128 extends C22724AuR {
        public PBEWithSHA1AESCBC128() {
            super((B35) C21907Acd.A00(), 1, 128);
        }
    }

    public class PBEWithSHA1AESCBC192 extends C22724AuR {
        public PBEWithSHA1AESCBC192() {
            super((B35) C21907Acd.A00(), 1, 192);
        }
    }

    public class PBEWithSHA1AESCBC256 extends C22724AuR {
        public PBEWithSHA1AESCBC256() {
            super((B35) C21907Acd.A00(), 1, 256);
        }
    }

    public class PBEWithSHA256AESCBC128 extends C22724AuR {
        public PBEWithSHA256AESCBC128() {
            super((B35) C21907Acd.A00(), 4, 128);
        }
    }

    public class PBEWithSHA256AESCBC192 extends C22724AuR {
        public PBEWithSHA256AESCBC192() {
            super((B35) C21907Acd.A00(), 4, 192);
        }
    }

    public class PBEWithSHA256AESCBC256 extends C22724AuR {
        public PBEWithSHA256AESCBC256() {
            super((B35) C21907Acd.A00(), 4, 256);
        }
    }
}
