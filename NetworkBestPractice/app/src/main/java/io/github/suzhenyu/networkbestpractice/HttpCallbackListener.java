package io.github.suzhenyu.networkbestpractice;

public interface HttpCallbackListener {

    void onFinish(String responder);

    void onError(Exception e);
}
