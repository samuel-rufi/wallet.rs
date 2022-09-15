// Copyright 2022 IOTA Stiftung
// SPDX-License-Identifier: Apache-2.0

package org.iota.types.secret;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Type;

@JsonAdapter(MnemonicSecretManager.MnemonicSecretManagerAdapter.class)
public class MnemonicSecretManager extends SecretManager {

    private String mnemonic;

    public MnemonicSecretManager(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public static class MnemonicSecretManagerAdapter implements JsonSerializer<MnemonicSecretManager> {
        @Override
        public JsonElement serialize(MnemonicSecretManager src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject o = new JsonObject();
            o.addProperty("Mnemonic", src.mnemonic);
            return o;
        }
    }

}


