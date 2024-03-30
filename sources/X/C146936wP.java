package X;

import com.whatsapp.R;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;

/* renamed from: X.6wP  reason: invalid class name and case insensitive filesystem */
public class C146936wP implements C160757lX, AnonymousClass7h2 {
    public final /* synthetic */ ChatTransferViewModel A00;

    public void BT4() {
    }

    public void BT5() {
    }

    public void BXA() {
    }

    public void BXC() {
    }

    public C146936wP(ChatTransferViewModel chatTransferViewModel) {
        this.A00 = chatTransferViewModel;
    }

    public void BXB(int i) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        chatTransferViewModel.A00 = i;
        int i2 = 50;
        if (chatTransferViewModel.A0S.A05()) {
            i2 = 98;
        }
        chatTransferViewModel.A0Y(R.string.f12nameremoved, 0 + ((i * (100 - i2)) / 100));
        if (chatTransferViewModel.A02 != 0) {
            chatTransferViewModel.A02 = 0;
        }
    }

    public void BZ3(int i, int i2) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        int i3 = (i * 100) / i2;
        chatTransferViewModel.A00 = i3;
        int i4 = 50;
        if (chatTransferViewModel.A0S.A05()) {
            i4 = 98;
        }
        chatTransferViewModel.A0Y(R.string.f12nameremoved, i4 + ((i3 * (100 - i4)) / 100));
        if (chatTransferViewModel.A02 != 2) {
            chatTransferViewModel.A02 = 2;
        }
    }

    public void onError(int i) {
        C001700s r0;
        Object A0S;
        ChatTransferViewModel chatTransferViewModel;
        int i2;
        C36321k7.A1T("fpm/ChatTransferViewModel/received errorCode: ", AnonymousClass000.A0u(), i);
        if (i != 2) {
            if (i != 102) {
                if (!(i == 107 || i == 504)) {
                    switch (i) {
                        case 600:
                            chatTransferViewModel = this.A00;
                            C36341k9.A19(chatTransferViewModel.A0F, false);
                            A0S = ChatTransferViewModel.A01();
                            break;
                        case 601:
                        case 602:
                        case 604:
                        case 605:
                            break;
                        case 603:
                            r0 = this.A00.A0G;
                            A0S = C36371kC.A0m();
                            break;
                        default:
                            chatTransferViewModel = this.A00;
                            A0S = chatTransferViewModel.A0T();
                            break;
                    }
                }
                chatTransferViewModel = this.A00;
                A0S = chatTransferViewModel.A0S();
            } else {
                chatTransferViewModel = this.A00;
                A0S = ChatTransferViewModel.A01();
            }
            int i3 = chatTransferViewModel.A01;
            int i4 = 4;
            if (i3 == 2 || i3 == 3) {
                i4 = 1;
            } else if (i3 == 4) {
                int i5 = chatTransferViewModel.A02;
                if (i5 == 0) {
                    i4 = 2;
                } else if (i5 == 1) {
                    i4 = 3;
                }
            } else {
                i4 = 0;
            }
            AnonymousClass6TQ r7 = chatTransferViewModel.A0Y;
            if (i != 200) {
                if (!(i == 202 || i == 302)) {
                    if (i != 501) {
                        switch (i) {
                            case 100:
                                break;
                            case 101:
                            case 102:
                                i2 = 17;
                                break;
                            case 103:
                                i2 = 11;
                                break;
                            case 104:
                            case 106:
                                i2 = 4;
                                break;
                            case 105:
                                i2 = 14;
                                break;
                            case 107:
                                i2 = 25;
                                break;
                            default:
                                switch (i) {
                                    case 503:
                                        i2 = 13;
                                        break;
                                    case 504:
                                    case 505:
                                        i2 = 9;
                                        break;
                                    default:
                                        switch (i) {
                                            case 600:
                                                i2 = 1;
                                                break;
                                            case 601:
                                                i2 = 26;
                                                break;
                                            case 602:
                                                i2 = 27;
                                                break;
                                            case 603:
                                            case 604:
                                                i2 = 5;
                                                break;
                                            case 605:
                                                i2 = 15;
                                                break;
                                            default:
                                                r7.A00.A0E("fpm/unexpected-migration-error-code", String.valueOf(i), false);
                                                i2 = 24;
                                                break;
                                        }
                                }
                        }
                    } else {
                        i2 = 10;
                    }
                }
                i2 = 23;
            } else {
                i2 = 22;
            }
            r7.A03(i4, (long) chatTransferViewModel.A00, i2);
            r0 = chatTransferViewModel.A0E;
        } else {
            ChatTransferViewModel chatTransferViewModel2 = this.A00;
            AnonymousClass6TQ r3 = chatTransferViewModel2.A0Y;
            r3.A05.Boy(new AnonymousClass734(r3, 12, 1, (long) chatTransferViewModel2.A00));
            r0 = chatTransferViewModel2.A0E;
            A0S = chatTransferViewModel2.A0S();
        }
        r0.A0C(A0S);
    }
}
