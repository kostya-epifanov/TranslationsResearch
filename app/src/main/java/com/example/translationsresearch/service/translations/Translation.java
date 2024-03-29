/*
 * Translation.java
 * webka
 *
 * Copyright (C) 2019, Realtime Technologies Ltd. All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the
 * property of Realtime Technologies Limited and its SUPPLIERS, if any.
 *
 * The intellectual and technical concepts contained herein are
 * proprietary to Realtime Technologies Limited and its suppliers and
 * may be covered by Russian Federation and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Realtime Technologies Limited.
 */

package com.example.translationsresearch.service.translations;

import com.example.translationsresearch.utils.Json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Objects;

import reactor.core.publisher.Mono;
import ru.realtimetech.webka.client.Client;

/**
 * Translation structure.
 *
 * @author Gleb Nikitenko
 * @author Konstantin Epifanov
 * @since 10.04.19
 */
@SuppressWarnings("WeakerAccess")
public final class Translation {

  /*private static final String[] HLS = {
    "https://rt-news-gd.secure2.footprint.net/1103_2500Kb.m3u8",
    "http://lb.streaming.sk/fashiontv/stream/playlist.m3u8",
    "http://dtv.ercdn.net/adsport1/adsport1_720p.m3u8",
    "http://mdslivehlsb-i.akamaihd.net/hls/live/623617/energy/bitrate_4.m3u8",
    "http://62.76.26.81:8081/hdmedia/menu/playlist.m3u8",
    "http://weather-lh.akamaihd.net/i/twc_1@92006/master",
    "http://stream.grupoabchn.com:1935/TENHD/TENLive.smil/master",
    "http://lb.streaming.sk/fashiontv/stream/playlist.m3u8",
    "http://dtv.ercdn.net/adsport1/adsport1_720p.m3u8",
    "http://mdslivehlsb-i.akamaihd.net/hls/live/623617/energy/bitrate_4.m3u8",
    "http://62.76.26.81:8081/hdmedia/menu/playlist.m3u8",
  };*/

  private static final String[] HLS = {
    "https://rt-news-gd.secure2.footprint.net/1103_2500Kb.m3u8",
    "https://mdslivehlsb-i.akamaihd.net/hls/live/623617/energy/bitrate_1.m3u8",
    "http://1mstream.digicable.hu/hitmusic/hitmusic.m3u8",
    "http://ss6.domint.net:2082/202_str/orbittv/media_w29206476_playlist.m3u8",
    "http://livestreamcdn.net:1935/ExtremaTV/ExtremaTV/playlist.m3u8",
    "http://locomotiontv.com/envivo/loco_channel/stream.m3u8?xtreamiptv.m3u8",
    "http://mdslivehlsb-i.akamaihd.net/hls/live/623616/boing/bitrate_2.m3u8",
    "http://dwstream3-lh.akamaihd.net/i/dwstream3_live@124409/index_5_av-p.m3u8?sd=10&rebase=on",
    "http://100automoto.tv:1935/bgtv1/autotv/playlist.m3u8",
    "http://59f1cbe63db89.streamlock.net:1935/dgrau/_definst_/dgrau/playlist.m3u8",
    "http://cdnlive.shooowit.net/rbetislive/smil:television.smil/playlist.m3u8",
    "http://svs.itworkscdn.net/ktvsportslive/ksports.smil/chunklist.m3u8",
    "http://rbmn-live.akamaized.net/hls/live/590964/BoRB-AT/master.m3u8",
    "http://tv-topshop.netrack.ru/hls/topshop.m3u8",
    "http://unilivemtveu-lh.akamaihd.net/i/mtvno_1@346424/master.m3u8",
    "http://81.30.182.82:18092/hls/live.m3u8",
    "http://bbcwshdlive01-lh.akamaihd.net/i/ptv_1@78015/master.m3u8",
    "http://evpp.mm.uol.com.br/ne10/ne10.smil/playlist.m3u8",
    "http://c2.manasat.com:1935/tserkov-online/russo3/playlist.m3u8",
    "http://rt-usa.secure.footprint.net/1105.m3u8",
    "http://rt-uk.secure.footprint.net/1106.m3u8",
    "http://livebeta.publika.md/LIVE/P/1500.m3u8",
    "http://ivebeta.publika.md/LIVE/P/1500.m3u8",
    "http://cdn1.live-tv.od.ua:8081/1tvkr/1tvkr-abr/1tvkr/1tvkr/playlist.m3u8",
    "http://rfe-lh.akamaihd.net/i/rfe_tvmc5@383630/master.m3u8",
    "http://cdn-01.bonus-tv.ru:8080/kriktv_edge/index.m3u8",
    "",
    "",
    "",
    "",
    "",
  };

  /** Stub translation */
  public static final String STUB =
    "{\"translationId\":1640,\"translationName\":\"video40\"," +
      "\"translationDescription\":\"video40\",\"translationImage\":null," +
      "\"sessionId\":\"3222222222x\",\"startTime\":\"2019-07-09T15:20:21.410808+03:00\"," +
      "\"countryIsoCode\":null,\"geonameId\":null,\"cityNames\":null,\"countryNames\":null," +
      "\"latitude\":null,\"longitude\":null,\"sessionName\":\"\\u0412\\u0438\\u0434\\u0435\\u043e " +
      "40\",\"sessionDescription\":\"\\u0412\\u0438\\u0434\\u0435\\u043e 40\"," +
      "\"sessionImage\":null,\"airId\":\"3222222222x\",\"airType\":\"PUBLIC\"," +
      "\"airStatus\":\"ONLINE\",\"airSettings\":{\"personalAirCost\":100,\"restrictedAirCost\":100," +
      "\"maxMembersCount\":32},\"streamMediaId\":40,\"streamType\":\"VIDEO\",\"streamWidth\":300," +
      "\"streamHeight\":162,\"userId\":1640,\"nickname\":\"cembern_caroldya\"," +
      "\"fullName\":\"Cembern Caroldya\",\"avatar\":null,\"videoSettings\":{\"geo\":null}," +
      "\"viewCount\":\"0\",\"tags\":[],\"chatId\":40,\"videoCover\":{\"width\":null," +
      "\"height\":null,\"mediaId\":null,\"createTime\":null,\"streamType\":null," +
      "\"updateTime\":null},\"streamMediaUrl\":\"https:\\/\\/media.webka.com\\/hls\\/vod\\/40" +
      ".mp4\\/index.m3u8\",\"isGeoBlocked\":false,\"hasAccessLimit\":false,\"hasAccess\":true," +
      "\"hasAccessFree\":true,\"isBanned\":false,\"waitingAirFinished\":null}";

  /** Translation id. */
  public final String id;

  /** Room Id. */
  public final long roomId;

  /** Session id. */
  public final String sessionId;

  /** Chat id. */
  public final int chatId;

  /** Translation name. */
  public final String name;

  /** Translation description. */
  public final String description;

  /** User nickname */
  public final String userNickName;

  /** User full name */
  public final String userFullName;

  /** View count */
  public final String viewCount;

  /** Stream Width Pixels */
  public final int streamWidth;

  /** Stream Height Pixels */
  public final int streamHeight;

  /** Time stamp. */
  public final String startTime;

  /** Media stream. */
  public final String streamMediaUrl;

  /** Media stream id. */
  public final int streamMediaId;

  /**
   * Translation Item global position
   * of backend by last response.
   */
  public final int pagingOffset;

  /** Cover picture. */
  public final String cover;

  /** Object hash. */
  private final int mHash;

  /**
   * Constructs a new {@link Translation}.
   *
   * @param json json response object
   */
  private Translation(JSONObject json, String covers) {
    id = Json.getString(json, "translationId");
    roomId = Json.getLong(json, "roomId");
    sessionId = Json.getString(json, "sessionId");
    chatId = Json.getInteger(json, "chatId");
    name = Json.getString(json, "translationName");
    description = Json.getString(json, "translationDescription");
    userNickName = Json.optString(json, "nickname").orElse("NO_NICKNAME");
    userFullName = Json.getString(json, "fullName");
    viewCount = Json.getString(json, "viewCount");
    startTime = Json.getString(json, "startTime");
    pagingOffset = Json.optInteger(json, "pageOffset").orElse(-1);
    streamMediaUrl = Json.optString(json, "streamMediaUrl").orElse(null);

    //try {
    //final String url = requireNonNull(json.getString("streamMediaUrl"), json::toString)
    /*.replace("10.10.0.8", "s1.rtt.space").replace("http", "https")*/
    //streamMediaUrl = "null".equals(url) ? "https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8" : url;
    //streamMediaUrl = "https://devstreaming-cdn.apple.com/videos/streaming/examples/bipbop_adv_example_hevc/v3/prog_index.m3u8";
    //streamMediaUrl = "http://online.video.rbc.ru/online/rbctv_480p/index.m3u8";
    //streamMediaUrl = "https://strm.yandex.ru/kal/1hd/1hd0_169_480p.json/index-v1-a1.m3u8";
    /*} catch (JSONException e) {
      streamMediaUrl = null;
    }*/

    streamWidth = Json.optInteger(json, "streamWidth").orElse(-1);
    streamHeight = Json.optInteger(json, "streamHeight").orElse(-1);
    streamMediaId = Json.optInteger(json, "streamMediaId").orElse(-1);

    cover = covers + "/" + streamMediaId;

    mHash = id.hashCode();
  }

  /**
   * @param json   json array
   * @param covers covers url
   *
   * @return set of translations
   */
  static Translation[] just(JSONArray json, String covers) {
    return Json.objects(json)
      .map(v -> new Translation(v, covers))
      .toArray(Translation[]::new);
  }

  /** {@inheritDoc} */
  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    final Translation translation = (Translation) obj;
    return mHash == translation.mHash &&
      Objects.equals(sessionId, translation.sessionId) &&
      Objects.equals(roomId, translation.roomId) &&
      Objects.equals(chatId, translation.chatId) &&
      Objects.equals(name, translation.name) &&
      Objects.equals(description, translation.description) &&
      Objects.equals(userNickName, translation.userNickName) &&
      Objects.equals(userFullName, translation.userFullName) &&
      Objects.equals(viewCount, translation.viewCount) &&
      Objects.equals(streamWidth, translation.streamWidth) &&
      Objects.equals(streamHeight, translation.streamHeight) &&
      Objects.equals(streamMediaId, translation.streamMediaId) &&
      Objects.equals(startTime, translation.startTime) &&
      Objects.equals(streamMediaUrl, translation.streamMediaUrl)
      ;
  }

  /** {@inheritDoc} */
  @Override
  public final int hashCode() {
    return mHash;
  }

  @Override
  public String toString() {
    return "Translation{" +
      "id='" + id + '\'' +
      ", sessionId='" + sessionId + '\'' +
      ", chatId=" + chatId +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", userNickName='" + userNickName + '\'' +
      ", userFullName='" + userFullName + '\'' +
      ", viewCount='" + viewCount + '\'' +
      ", streamWidth=" + streamWidth +
      ", streamHeight=" + streamHeight +
      ", startTime='" + startTime + '\'' +
      ", streamMediaUrl='" + streamMediaUrl + '\'' +
      ", streamMediaId=" + streamMediaId +
      ", pagingOffset=" + pagingOffset +
      ", cover='" + cover + '\'' +
      ", mHash=" + mHash +
      '}';
  }

  /** Returns random dummy image URL */
  private String getRandomImageUrl(int pagingOffset) {
    pagingOffset += 10;
    return "https://picsum.photos/id/" + pagingOffset + "/600/800";
  }

  public static Mono<Translation> start(Client client, int systemTagId, String name) {
    return Mono.from(client.post("translation", "status", "ONLINE", "type", "PUBLIC","systemTagId", systemTagId, "name", name))
      .map(Json::object).map(jsonObject -> new Translation(jsonObject, client.storage("1")));
  }

  public static Mono<String> stop(Client client, long roomId, String translationId){
    return Mono.from(client.put("translation/stop", "roomId", roomId, "translationId", translationId));
  }


  public static Mono<String> delete(Client client, String translationId){
    return Mono.from(client.delete("translation","translationId", translationId));
  }

  public static Mono<Translation> bySessionId(Client client, String sessionId) {
    return Mono.from(client.get("translation/session", "sessionId", sessionId))
      .map(Json::object).map(jsonObject -> new Translation(jsonObject, client.storage("1")));
  }

  public static Mono<Translation[]> videoMain(Client client, int offset, int limit) {
    final String cover = client.storage("1");
    return Mono.from(client.get("video/main", "offset", offset, "limit", limit))
      .map(Json::array).map(jsonArray -> Translation.just(jsonArray, cover));
  }

}
