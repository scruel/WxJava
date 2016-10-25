package me.chanjar.weixin.mp.bean.custombuilder;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;

public class BaseBuilder<T> {
  protected String msgType;
  protected String toUser;

  public T toUser(String toUser) {
    this.toUser = toUser;
    return (T) this;
  }

  public WxMpKefuMessage build() {
    WxMpKefuMessage m = new WxMpKefuMessage();
    m.setMsgType(this.msgType);
    m.setToUser(this.toUser);
    return m;
  }
}
