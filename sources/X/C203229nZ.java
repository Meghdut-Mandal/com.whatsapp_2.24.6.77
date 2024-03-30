package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.9nZ  reason: invalid class name and case insensitive filesystem */
public abstract class C203229nZ {
    public static int A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -867509719:
                    if (str.equals("reaction")) {
                        return 48;
                    }
                    break;
                case 110760:
                    if (str.equals("pay")) {
                        return 46;
                    }
                    break;
                case 3446719:
                    if (str.equals("poll")) {
                        return 47;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return 45;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        return 44;
                    }
                    break;
                case 431262765:
                    if (str.equals("medianotify")) {
                        return 49;
                    }
                    break;
            }
        }
        return 1;
    }

    public static Integer A04(int i) {
        int i2;
        if (i != 7) {
            i2 = 1;
            if (i != 8) {
                return null;
            }
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public static int A00(AnonymousClass11F r1) {
        if (r1 instanceof C177528dw) {
            return 3;
        }
        if (AnonymousClass143.A0G(r1)) {
            return 2;
        }
        if (r1 instanceof C177548dy) {
            return 6;
        }
        if (r1 instanceof C177618e5) {
            return 14;
        }
        if (r1 instanceof C28981Uw) {
            return 13;
        }
        if (AnonymousClass143.A0H(r1)) {
            return 15;
        }
        return 1;
    }

    public static int A01(AnonymousClass11F r1, boolean z) {
        if (z) {
            return 12;
        }
        if (r1 instanceof C28981Uw) {
            return 10;
        }
        if (r1 instanceof C177528dw) {
            return 4;
        }
        if (AnonymousClass143.A0G(r1)) {
            return 3;
        }
        if (r1 instanceof C177618e5) {
            return 11;
        }
        if (AnonymousClass143.A0H(r1)) {
            return 13;
        }
        return 2;
    }

    public static int A02(AnonymousClass3T1 r1) {
        AnonymousClass11F r0 = r1.A1J.A00;
        boolean z = r0 instanceof C177528dw;
        boolean A0G = AnonymousClass143.A0G(r0);
        if (z) {
            return 3;
        }
        return C36371kC.A00(A0G ? 1 : 0);
    }

    public static Integer A05(C19730wQ r1, DeviceJid deviceJid) {
        int i;
        if (deviceJid == null) {
            return null;
        }
        if (r1.A0N(deviceJid)) {
            i = 3;
            if (AnonymousClass9ZV.A00(deviceJid)) {
                i = 5;
            }
        } else if (deviceJid.getDevice() == 0) {
            boolean A0M = r1.A0M(deviceJid.userJid);
            i = 2;
            if (A0M) {
                i = 1;
            }
        } else {
            i = 4;
            if (AnonymousClass9ZV.A00(deviceJid)) {
                i = 6;
            }
        }
        return Integer.valueOf(i);
    }

    public static Integer A06(Jid jid, Jid jid2) {
        int i;
        boolean z = jid2 instanceof C177538dx;
        Integer A0j = C36361kB.A0j();
        if (z || (jid instanceof C177538dx)) {
            return A0j;
        }
        if (jid == null) {
            return null;
        }
        if (AnonymousClass143.A0G(jid)) {
            i = 1;
        } else if (jid instanceof C177528dw) {
            i = 3;
        } else if (jid instanceof C28981Uw) {
            i = 4;
        } else {
            i = 0;
            if (AnonymousClass143.A0H(jid)) {
                i = 5;
            }
        }
        return Integer.valueOf(i);
    }

    public static String A07(AnonymousClass1DW r5, AnonymousClass8SX r6) {
        int i = r6.bitField0_;
        if ((i & 4) != 0) {
            return "image";
        }
        if ((i & 8) != 0) {
            return "vcard";
        }
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            return "contact_array";
        }
        if ((i & 16) != 0) {
            return "location";
        }
        if ((65536 & i) != 0) {
            return "livelocation";
        }
        if (AnonymousClass000.A1P(i & 32)) {
            AnonymousClass8SD r0 = r6.extendedTextMessage_;
            AnonymousClass8SD r1 = r0;
            if (r0 == null) {
                r0 = AnonymousClass8SD.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass8SD.DEFAULT_INSTANCE;
                }
                String str = r1.text_;
                AnonymousClass1DU r12 = r5.A02;
                if (r5.A0G(r12.A03(str))) {
                    return "cataloglink";
                }
                if (r5.A0H(r12.A03(str))) {
                    return "productlink";
                }
                return "url";
            }
        } else if ((i & 64) != 0) {
            return "document";
        } else {
            if ((i & 128) != 0) {
                AnonymousClass8S5 r02 = r6.audioMessage_;
                if (r02 == null) {
                    r02 = AnonymousClass8S5.DEFAULT_INSTANCE;
                }
                if (r02.ptt_) {
                    return "ptt";
                }
                return "audio";
            } else if ((i & 256) != 0) {
                AnonymousClass8SE r03 = r6.videoMessage_;
                if (r03 == null) {
                    r03 = AnonymousClass8SE.DEFAULT_INSTANCE;
                }
                if (r03.gifPlayback_) {
                    return "gif";
                }
                return "video";
            } else {
                int i2 = r6.bitField1_;
                if ((2097152 & i2) != 0) {
                    return "ptv";
                }
                if (!r6.A0y()) {
                    if (r6.A0z() || AnonymousClass000.A1P(r6.bitField1_ & 134217728)) {
                        AnonymousClass8SA r04 = r6.stickerMessage_;
                        AnonymousClass8SA r13 = r04;
                        if (r04 == null) {
                            r04 = AnonymousClass8SA.DEFAULT_INSTANCE;
                        }
                        if (r04.isAvatar_) {
                            return "avatar_sticker";
                        }
                        if (r13 == null) {
                            r13 = AnonymousClass8SA.DEFAULT_INSTANCE;
                        }
                        if (r13.isAiSticker_) {
                            return "genai_sticker";
                        }
                        return "sticker";
                    } else if ((16777216 & i) != 0) {
                        AnonymousClass8RR r05 = r6.productMessage_;
                        AnonymousClass8RR r14 = r05;
                        if (r05 == null) {
                            r05 = AnonymousClass8RR.DEFAULT_INSTANCE;
                        }
                        if ((r05.bitField0_ & 1) != 0) {
                            return "product";
                        }
                        if (r14 == null) {
                            r14 = AnonymousClass8RR.DEFAULT_INSTANCE;
                        }
                        if ((r14.bitField0_ & 4) != 0) {
                            return "catalog";
                        }
                    } else if ((536870912 & i) != 0) {
                        return "order";
                    } else {
                        if ((i & 134217728) != 0) {
                            return "list";
                        }
                        if ((i & 1073741824) != 0) {
                            return "list_response";
                        }
                        if ((i2 & 2) != 0) {
                            return "buttons_response";
                        }
                        if ((i2 & 32) != 0) {
                            AnonymousClass8QZ r06 = r6.interactiveResponseMessage_;
                            if (r06 == null) {
                                r06 = AnonymousClass8QZ.DEFAULT_INSTANCE;
                            }
                            if (r06.interactiveResponseMessageCase_ == 2) {
                                return "native_flow_response";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
