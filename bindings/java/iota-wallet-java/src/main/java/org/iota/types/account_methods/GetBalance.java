package org.iota.types.account_methods;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.iota.types.ids.OutputId;

public class GetBalance implements AccountMethod {

    private OutputId outputId;

    public GetBalance withOutputId(OutputId outputId) {
        this.outputId = outputId;
        return this;
    }

    @Override
    public JsonElement toJson() {
        JsonObject o = new JsonObject();
        o.addProperty("outputId", outputId.toString());

        return o;
    }
}