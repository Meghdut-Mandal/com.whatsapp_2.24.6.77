package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public class ABY implements C22938Ayo, C22942Ays, C17740rx {
    public AnonymousClass1AW A00;

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof AnonymousClass2bZ, AnonymousClass000.A0l(r5, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass000.A0u()));
        C207219uk r1 = ((AnonymousClass2bZ) r5).A00;
        if (r1 != null) {
            this.A00.A00(r1).A0F(r4, r5);
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r29) {
        AnonymousClass2bZ r0;
        int i;
        C206819u1 r2;
        AnonymousClass8Q5 r22;
        C23122B6c b6c;
        C23122B6c<AnonymousClass8Q6> b6c2;
        AnonymousClass9YL r7 = r29;
        AnonymousClass8SX r6 = r7.A0A;
        if ((r6.bitField0_ & 134217728) == 0) {
            return null;
        }
        C64933Qa r4 = r7.A0C;
        long j = r7.A04;
        AnonymousClass8SP r9 = r6.listMessage_;
        if (r9 == null) {
            r9 = AnonymousClass8SP.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r9);
        if ((r9.bitField0_ & 8) != 0) {
            AnonymousClass90a A0u = r9.A0u();
            AnonymousClass90a r5 = AnonymousClass90a.SINGLE_SELECT;
            if (A0u == r5) {
                r0 = new C180948mg(r4, j);
                i = 1;
            } else if (A0u == AnonymousClass90a.PRODUCT_LIST) {
                r0 = new C180958mh(r4, j);
                i = 2;
            }
            if (!TextUtils.isEmpty(r9.description_) && (r9.bitField0_ & 8) != 0 && (!TextUtils.isEmpty(r9.buttonText_) || r9.A0u() != r5)) {
                AnonymousClass90a A0u2 = r9.A0u();
                if (A0u2 == r5) {
                    C23122B6c b6c3 = r9.sections_;
                    if (!(b6c3 == null || b6c3.size() == 0)) {
                        int i2 = 0;
                        while (i2 < b6c3.size()) {
                            AnonymousClass8P9 r23 = (AnonymousClass8P9) b6c3.get(i2);
                            if (!((i2 != 0 && TextUtils.isEmpty(r23.title_)) || (b6c2 = r23.rows_) == null || b6c2.size() == 0)) {
                                for (AnonymousClass8Q6 r1 : b6c2) {
                                    if (TextUtils.isEmpty(r1.title_)) {
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                } else if (A0u2 == AnonymousClass90a.PRODUCT_LIST && !(((r22 = r9.productListInfo_) == null && (r22 = AnonymousClass8Q5.DEFAULT_INSTANCE) == null) || (b6c = r22.productSections_) == null || b6c.size() == 0)) {
                    loop2:
                    for (AnonymousClass8P8 r24 : r22.productSections_) {
                        C23122B6c b6c4 = r24.products_;
                        if (b6c4 != null && b6c4.size() != 0) {
                            Iterator it = r24.products_.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.isEmpty(((C172378Np) it.next()).productId_)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
                C206659tl r8 = new C206659tl(r9.title_, (byte[]) null, (String) null);
                String str = r9.description_;
                String str2 = r9.footerText_;
                String str3 = r9.buttonText_;
                C23122B6c<AnonymousClass8P9> b6c5 = r9.sections_;
                ArrayList A0I = AnonymousClass001.A0I();
                if (b6c5 != null) {
                    for (AnonymousClass8P9 r12 : b6c5) {
                        String str4 = r12.title_;
                        C23122B6c<AnonymousClass8Q6> b6c6 = r12.rows_;
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        for (AnonymousClass8Q6 r13 : b6c6) {
                            String str5 = r13.rowId_;
                            String str6 = r13.title_;
                            String str7 = r13.description_;
                            C36321k7.A0x(str5, str6);
                            A0I2.add(new C206729ts(str5, (String) null, str6, str7));
                        }
                        AnonymousClass00C.A0D(str4, 1);
                        A0I.add(new C206689to(str4, (String) null, A0I2));
                    }
                }
                AnonymousClass8Q5 r11 = r9.productListInfo_;
                if (r11 == null) {
                    r11 = AnonymousClass8Q5.DEFAULT_INSTANCE;
                }
                if (r11 == null) {
                    r2 = null;
                } else {
                    AnonymousClass8P7 r14 = r11.headerImage_;
                    if (r14 == null) {
                        r14 = AnonymousClass8P7.DEFAULT_INSTANCE;
                    }
                    byte[] A06 = r14.jpegThumbnail_.A06();
                    AnonymousClass8P7 r15 = r11.headerImage_;
                    if (r15 == null) {
                        r15 = AnonymousClass8P7.DEFAULT_INSTANCE;
                    }
                    C206669tm r10 = new C206669tm(A06, r15.productId_, false);
                    String str8 = r11.businessOwnerJid_;
                    try {
                        C23122B6c<AnonymousClass8P8> b6c7 = r11.productSections_;
                        ArrayList A0I3 = AnonymousClass001.A0I();
                        if (b6c7 != null) {
                            for (AnonymousClass8P8 r16 : b6c7) {
                                String str9 = r16.title_;
                                C23122B6c<C172378Np> b6c8 = r16.products_;
                                ArrayList A0I4 = AnonymousClass001.A0I();
                                if (b6c8 != null) {
                                    for (C172378Np r17 : b6c8) {
                                        A0I4.add(new C206509tW(r17.productId_));
                                    }
                                }
                                A0I3.add(new C206579td(str9, A0I4));
                            }
                        }
                        C222813r r18 = UserJid.Companion;
                        r2 = new C206819u1(C222813r.A01(str8), r10, A0I3);
                    } catch (C19740wR e) {
                        C90464aC.A1L("FMessageListProtobuf/parseE2EProductListInfo/Invalid jid: ", str8, AnonymousClass000.A0u(), e);
                        r2 = null;
                    }
                }
                r0.BqZ(new C207219uk((C207199ui) null, (C206489tU) null, r8, (C207089uX) null, r2, (C206679tn) null, (AnonymousClass3XY) null, str, str2, str3, (String) null, A0I, i));
                return r0;
            }
            C36321k7.A1L(r4, "FMessageListProtobuf/parseFMessageList/invalid message; message.key=", AnonymousClass000.A0u());
            throw C165567td.A0J(26);
        }
        return new AnonymousClass2bK(r4, r6.A0o(), 2, r7.A01, j);
    }

    public ABY(AnonymousClass1AW r1) {
        this.A00 = r1;
    }
}
