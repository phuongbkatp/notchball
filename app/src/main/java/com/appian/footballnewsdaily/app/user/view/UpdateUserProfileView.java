package com.appian.footballnewsdaily.app.user.view;

import com.appnet.android.football.fbvn.data.AccountProfile;

public interface UpdateUserProfileView {
    void updateSuccess(AccountProfile data);
    void updateFail();
}
