package io.ably.demo.connection;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.BaseMessage;

public interface ConnectionCallback {

    void onConnectionCallback() throws AblyException;

    void onConnectionCallbackWithResult(BaseMessage[] result) throws AblyException;
}

