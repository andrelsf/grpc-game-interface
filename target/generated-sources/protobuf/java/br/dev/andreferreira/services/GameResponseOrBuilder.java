// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/GameResponse.proto

package br.dev.andreferreira.services;

public interface GameResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.GameResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .models.Game game = 1;</code>
   */
  java.util.List<br.dev.andreferreira.entities.Game> 
      getGameList();
  /**
   * <code>repeated .models.Game game = 1;</code>
   */
  br.dev.andreferreira.entities.Game getGame(int index);
  /**
   * <code>repeated .models.Game game = 1;</code>
   */
  int getGameCount();
  /**
   * <code>repeated .models.Game game = 1;</code>
   */
  java.util.List<? extends br.dev.andreferreira.entities.GameOrBuilder> 
      getGameOrBuilderList();
  /**
   * <code>repeated .models.Game game = 1;</code>
   */
  br.dev.andreferreira.entities.GameOrBuilder getGameOrBuilder(
      int index);
}
