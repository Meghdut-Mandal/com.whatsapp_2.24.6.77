package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

public interface RecaptchaTasksClient {
    Task executeTask(RecaptchaAction recaptchaAction);

    Task executeTask(RecaptchaAction recaptchaAction, long j);
}
