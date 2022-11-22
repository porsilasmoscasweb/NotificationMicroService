package com.reloadly.ms_03.notification;

import com.reloadly.ms_03.model.Account;
import org.springframework.scheduling.annotation.Async;

public interface EmailSender {

    @Async
    void send(Account acc);
}
