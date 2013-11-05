/**
 * Copyright (c) 2012, Oliver Kleine, Institute of Telematics, University of Luebeck
 * All rights reserved
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *  - Redistributions of source messageCode must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *  - Neither the name of the University of Luebeck nor the names of its contributors may be used to endorse or promote
 *    products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
///**
// * Copyright (c) 2012, Oliver Kleine, Institute of Telematics, University of Luebeck
// * All rights reserved
// *
// * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
// * following conditions are met:
// *
// *  - Redistributions of source code must retain the above copyright notice, this list of conditions and the following
// *    disclaimer.
// *
// *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
// *    following disclaimer in the documentation and/or other materials provided with the distribution.
// *
// *  - Neither the name of the University of Luebeck nor the names of its contributors may be used to endorse or promote
// *    products derived from this software without specific prior written permission.
// *
// * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
// * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
// * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
// * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
// * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// */
//package de.uniluebeck.itm.ncoap.communication;
//
//import de.uniluebeck.itm.ncoap.communication.encoding.CoapMessageDecoder;
//import de.uniluebeck.itm.ncoap.communication.encoding.CoapMessageEncoder;
//
//
//import org.jboss.netty.channel.ChannelPipeline;
//import org.jboss.netty.channel.ChannelPipelineFactory;
//import org.jboss.netty.channel.Channels;
//import org.jboss.netty.handler.execution.ExecutionHandler;
//import org.jboss.netty.channel.socket.DatagramChannel;
//
//import java.util.concurrent.ScheduledExecutorService;
//
///**
// * Factory to provide the {@link ChannelPipeline} for newly created {@link DatagramChannel}s via
// * {@link CoapServerDatagramChannelFactory}.
// *
// * @author Oliver Kleine
// */
//public class CoapServerPipelineFactory implements ChannelPipelineFactory {
//
//    private ExecutionHandler executionHandler;
//
//    private CoapMessageEncoder encoder;
//    private CoapMessageDecoder decoder;
//
////    private OutgoingMessageReliabilityHandler outgoingMessageReliabilityHandler;
////    private IncomingMessageReliabilityHandler incomingMessageReliabilityHandler;
////
////    private ObservableResourceHandler observableResourceHandler;
//
//    /**
//     * @param ioExecutorService The {@link ScheduledExecutorService} to provide the thread(s) for I/O operations
//     */
//    public CoapServerPipelineFactory(ScheduledExecutorService ioExecutorService){
//
//        this.executionHandler = new ExecutionHandler(ioExecutorService);
//
//        this.encoder = new CoapMessageEncoder();
//        this.decoder = new CoapMessageDecoder();
//
////        this.outgoingMessageReliabilityHandler = new OutgoingMessageReliabilityHandler(ioExecutorService);
////        this.incomingMessageReliabilityHandler = new IncomingMessageReliabilityHandler(ioExecutorService);
////
////        this.observableResourceHandler = new ObservableResourceHandler(ioExecutorService);
//    }
//
//
//    @Override
//    public ChannelPipeline getPipeline() throws Exception {
//        ChannelPipeline pipeline = Channels.pipeline();
//
//        pipeline.addLast("Execution Handler", executionHandler);
//
//        pipeline.addLast("CoAP Message Encoder", encoder);
//        pipeline.addLast("CoAP Message Decoder", decoder);
//
////        pipeline.addLast("OutgoingMessageReliabilityHandler", outgoingMessageReliabilityHandler);
////        pipeline.addLast("IncomingMessageReliabilityHandler", incomingMessageReliabilityHandler);
////
////        pipeline.addLast("ObservableResourceHandler", observableResourceHandler);
//
//        return pipeline;
//    }
//
////    /**
////     * Returns the {@link ObservableResourceHandler} which is part of each pipline from this factory
////     * @return the {@link ObservableResourceHandler} which is part of each pipline from this factory
////     */
////    public ObservableResourceHandler getObservableResourceHandler(){
////        return this.observableResourceHandler;
////    }
//
//}