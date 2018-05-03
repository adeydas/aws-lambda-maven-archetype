package ${groupId};

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaHandler implements RequestHandler<Request, Response> {

    private static Logger LOG = LoggerFactory.getLogger(LambdaHandler.class);

    public Response handleRequest(Request request, Context context) {
        LOG.info("My lambda has started");
        final Response response = new Response("my-lambda");
        return response;
    }
}