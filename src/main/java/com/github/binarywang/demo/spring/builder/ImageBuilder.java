package com.github.binarywang.demo.spring.builder;

import com.github.binarywang.demo.spring.service.WeixinService;

import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutImageMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;

/**
 * 
 * @author Binary Wang
 *
 */
public class ImageBuilder extends AbstractBuilder {

  @Override
  public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
      WeixinService service) {

    WxMpXmlOutImageMessage m = WxMpXmlOutMessage.IMAGE().mediaId(content)
        .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
        .build();

    return m;
  }

}
