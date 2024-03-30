package X;

import android.view.View;
import android.widget.ListView;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.4MX  reason: invalid class name */
public final class AnonymousClass4MX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ View $progress;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MX(View view, InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity, boolean z) {
        super(1);
        this.$progress = view;
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
        this.$shouldHideShareLink = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ListView listView;
        View view;
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 0) {
                this.$progress.setVisibility(0);
            } else if (intValue == 1) {
                this.$progress.setVisibility(8);
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
                C229216m r0 = inviteNonWhatsAppContactPickerActivity.A07;
                if (r0 != null) {
                    InviteNonWhatsAppContactPickerActivity.A0G(inviteNonWhatsAppContactPickerActivity, r0.A00(), this.$shouldHideShareLink);
                } else {
                    throw C36331k8.A0d("contactAccessHelper");
                }
            } else {
                if (intValue == 2) {
                    this.$progress.setVisibility(8);
                    if (!this.$shouldHideShareLink) {
                        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity2 = this.this$0;
                        ListView listView2 = inviteNonWhatsAppContactPickerActivity2.A04;
                        if (listView2 == null) {
                            throw C36331k8.A0d("listView");
                        }
                        if (listView2.getHeaderViewsCount() == 0) {
                            ListView listView3 = inviteNonWhatsAppContactPickerActivity2.A04;
                            if (listView3 == null) {
                                throw C36331k8.A0d("listView");
                            }
                            View view2 = inviteNonWhatsAppContactPickerActivity2.A03;
                            if (view2 == null) {
                                throw C36331k8.A0d("listViewHeader");
                            }
                            listView3.addHeaderView(view2);
                        }
                        listView = inviteNonWhatsAppContactPickerActivity2.A04;
                        if (listView == null) {
                            throw C36331k8.A0d("listView");
                        }
                        view = inviteNonWhatsAppContactPickerActivity2.A02;
                        if (view == null) {
                            throw C36331k8.A0d("listViewFooter");
                        }
                        listView.removeFooterView(view);
                    }
                } else if (intValue == 3) {
                    this.$progress.setVisibility(8);
                    if (!this.$shouldHideShareLink) {
                        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity3 = this.this$0;
                        ListView listView4 = inviteNonWhatsAppContactPickerActivity3.A04;
                        if (listView4 == null) {
                            throw C36331k8.A0d("listView");
                        }
                        if (listView4.getFooterViewsCount() == 0) {
                            ListView listView5 = inviteNonWhatsAppContactPickerActivity3.A04;
                            if (listView5 == null) {
                                throw C36331k8.A0d("listView");
                            }
                            View view3 = inviteNonWhatsAppContactPickerActivity3.A02;
                            if (view3 == null) {
                                throw C36331k8.A0d("listViewFooter");
                            }
                            listView5.addFooterView(view3);
                        }
                        ListView listView6 = inviteNonWhatsAppContactPickerActivity3.A04;
                        if (listView6 == null) {
                            throw C36331k8.A0d("listView");
                        }
                        View view4 = inviteNonWhatsAppContactPickerActivity3.A03;
                        if (view4 == null) {
                            throw C36331k8.A0d("listViewHeader");
                        }
                        listView6.removeHeaderView(view4);
                    }
                }
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity4 = this.this$0;
                ListView listView7 = inviteNonWhatsAppContactPickerActivity4.A04;
                if (listView7 == null) {
                    throw C36331k8.A0d("listView");
                }
                View view5 = inviteNonWhatsAppContactPickerActivity4.A03;
                if (view5 == null) {
                    throw C36331k8.A0d("listViewHeader");
                }
                listView7.removeHeaderView(view5);
                listView = inviteNonWhatsAppContactPickerActivity4.A04;
                if (listView == null) {
                    throw C36331k8.A0d("listView");
                }
                view = inviteNonWhatsAppContactPickerActivity4.A02;
                if (view == null) {
                    throw C36331k8.A0d("listViewFooter");
                }
                listView.removeFooterView(view);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
