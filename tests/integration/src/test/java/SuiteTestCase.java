import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
    // org.mule.properties.InvalidSetVariableTestCase.class,
    // org.mule.impl.config.builders.AutoConfigurationBuilderTestCase.class,
    // org.mule.test.construct.FlowRefTestCase.class,
    // org.mule.test.construct.FlowConfigurationFunctionalTestCase.class,
    // org.mule.test.construct.FlowOutboundInMiddleOfFlowTestCase.class,
    // org.mule.test.construct.FlowSynchronousProcessingStrategyTestCase.class,
    // org.mule.test.construct.FlowAsyncBeforeAfterOutboundTestCase.class,
    // org.mule.test.construct.OneWayOutboundReturningEventTestCase.class,
    // org.mule.test.construct.FilterInSubFlowTestCase.class,
    // org.mule.test.construct.FlowNestingTestCase.class,
    // org.mule.test.construct.DynamicSubFlowTestCase.class,
    // org.mule.test.construct.SubFlowTestCase.class,
    // org.mule.test.construct.FlowDefaultProcessingStrategyTestCase.class,
    // org.mule.test.core.NonBlockingFullySupportedFunctionalTestCase.class,
    // org.mule.test.core.routing.outbound.MultipleCollectionAggregatorsTestCase.class,
    // org.mule.test.core.routing.outbound.MulticastRouterTestCase.class,
    // org.mule.test.core.routing.outbound.AggregationTimeoutTestCase.class,
    // org.mule.test.core.routing.outbound.AggregationTestCase.class,
    // org.mule.test.core.Mule4412TestCase.class,
    org.mule.test.core.LogConfigurationTestCase.class,
    // org.mule.test.core.EmbeddedMuleTestCase.class,
    // org.mule.test.core.context.notification.ExceptionStrategyNotificationTestCase.class,
    // org.mule.test.core.context.notification.PipelineMessageNotificationTestCase.class,
    // org.mule.test.core.context.notification.ComponentMessageNotificationTestCase.class,
    // org.mule.test.core.context.notification.ComponentMessageNotificationNoXMLTestCase.class,
    // org.mule.test.core.context.notification.FlowStackTestCase.class,
    // org.mule.test.core.context.notification.ExceptionNotificationTestCase.class,
    // org.mule.test.core.context.notification.processors.MulticastingRouterNotificationTestCase.class,
    // org.mule.test.core.context.notification.processors.HttpMessageProcessorNotificationTestCase.class,
    // org.mule.test.core.context.notification.processors.ComponentPathTestCase.class,
    // org.mule.test.core.context.notification.processors.MessageProcessorNotificationTestCase.class,
    // org.mule.test.core.context.notification.ProcessorsTraceTestCase.class,
    // org.mule.test.core.context.notification.FailingNotificationListenerTestCase.class,
    // org.mule.test.core.context.notification.ConnectorMessageErrorNotificationTestCase.class,
    // org.mule.test.core.context.notification.ConnectorMessageNotificationTestCase.class,
    // org.mule.test.core.context.ComponentFailsToInitialiseTestCase.class,
    org.mule.test.core.transformers.simple.RegistryTransformerLifecycleTestCase.class// ,
    // org.mule.test.core.transformers.simple.TransformationContentTypeTestCase.class,
    // org.mule.test.core.transformers.simple.MapBeanTransformersTestCase.class,
    // org.mule.test.core.transformers.simple.SetPropertyDataTypeTestCase.class,
    // org.mule.test.core.transformers.simple.TransformerArraysTestCase.class,
    // org.mule.test.core.transformers.simple.SetFlowVariableDataTypeTestCase.class,
    // org.mule.test.core.transformers.simple.ExpressionTransformerELTestCase.class,
    // org.mule.test.core.transformers.simple.BadTransformationContentTypeTestCase.class,
    // org.mule.test.core.transformers.simple.SetPayloadDataTypeTestCase.class,
    // org.mule.test.core.NonBlockingPartlySupportedFunctionalTestCase.class,
    // org.mule.test.core.security.MultiuserSecurityTestCase.class,
    // org.mule.test.core.security.MultiuserSecurityWithMultiuserProviderTestCase.class,
    // org.mule.test.spring.ComponentLifecycleTestCase.class, org.mule.test.spring.PropertyPlaceholderMule2150TestCase.class,
    // org.mule.test.spring.PropertyPlaceholderDefaultTestCase.class,
    // org.mule.test.spring.SpringNamespaceConfigBuilderV2TestCase.class,
    // org.mule.test.spring.SchemaValidationMule2225TestCase.class, org.mule.test.spring.ObjectFactoryTestCase.class,
    // org.mule.test.spring.SpringNamespaceConfigBuilderTestCase.class, org.mule.test.spring.NestExampleTestCase.class,
    // org.mule.test.spring.PoolingProfileTestCase.class, org.mule.test.routing.UntilSuccessfulWithSplitterTestCase.class,
    // org.mule.test.routing.CollectionAggregatorRouterCustomStoreTestCase.class,
    // org.mule.test.routing.UntilSuccessfulInvalidConfigTestCase.class,
    // org.mule.test.routing.CollectionAggregatorRouterSerializationTestCase.class,
    // org.mule.test.routing.FirstSuccessfulTestCase.class, org.mule.test.routing.ScatterGatherOneRouteTestCase.class,
    // org.mule.test.routing.ForeachTestCase.class, org.mule.test.routing.UntilSuccessfulTestCase.class,
    // org.mule.test.routing.CorrelationResequencerTestCase.class,
    // org.mule.test.routing.CollectionAggregatorRouterTimeoutTestCase.class, org.mule.test.routing.RoundRobinTestCase.class,
    // org.mule.test.config.SecurityFilterNonBlockingTestCase.class, org.mule.test.config.MuleConfigurationConfigTestCase.class,
    // org.mule.test.config.IdempotentMessageFilterNamespaceHandlerTestCase.class,
    // org.mule.test.config.ExceptionHelperTestCase.class,
    // org.mule.test.config.spring.handlers.DefaultRetryPolicyProviderAsyncTestCase.class,
    // org.mule.test.config.spring.handlers.DefaultRetryPolicyProviderTestCase.class,
    // org.mule.test.config.spring.DslConstantsRoutersFlowTestCase.class,
    // org.mule.test.config.spring.BeanProfileTwoTestCase.class,
    // org.mule.test.config.spring.InjectDefaultObjectSerializerTestCase.class,
    // org.mule.test.config.spring.RegistrationAndInjectionTestCase.class,
    // org.mule.test.config.spring.ClassInterceptorTestCase.class, org.mule.test.config.spring.NamedInterceptorTestCase.class,
    // org.mule.test.config.spring.flow.FlowProcessingStrategyConfigTestCase.class,
    // org.mule.test.config.spring.ManuallyRegisteredObjectLifecycleTestCase.class,
    // org.mule.test.config.spring.SpringAOPSpringBeanLookupTestCase.class,
    // org.mule.test.config.spring.LookupPrototypeByKeyTestCase.class, org.mule.test.config.spring.MuleContextAwareTestCase.class,
    // org.mule.test.config.spring.BeanProfileOneTestCase.class,
    // org.mule.test.config.spring.GlobalInterceptingMessageProcessorsTestCase.class,
    // org.mule.test.config.spring.RootSchemaValidationTestCase.class,
    // org.mule.test.config.spring.parsers.NamedDynamicTestCase.class,
    // org.mule.test.config.spring.parsers.InheritSimpleTestCase.class,
    // org.mule.test.config.spring.parsers.ParentNamespaceTestCase.class,
    // org.mule.test.config.spring.parsers.MapMule2478TestCase.class,
    // org.mule.test.config.spring.parsers.ConstrainedConnectorExceptionStrategyMule2126TestCase.class,
    // org.mule.test.config.spring.parsers.EndpointServiceConflictTestCase.class,
    // org.mule.test.config.spring.parsers.ThirdPartyTestCase.class,
    // org.mule.test.config.spring.parsers.BindingCollectionTestCase.class,
    // org.mule.test.config.spring.parsers.DuplicateBeanNameTestCase.class,
    // org.mule.test.config.spring.parsers.ReferenceCollectionTestCase.class,
    // org.mule.test.config.spring.parsers.NamedNamespaceTestCase.class,
    // org.mule.test.config.spring.parsers.ReferenceCollectionAutoTestCase.class,
    // org.mule.test.config.spring.parsers.NameAndIdEqualMule2795TestCase.class,
    // org.mule.test.config.spring.parsers.ListElementTestCase.class,
    // org.mule.test.config.spring.parsers.MissingParserTestCase.class,
    // org.mule.test.config.spring.parsers.NamedSimpleTestCase.class,
    // org.mule.test.config.spring.parsers.ParentSimpleTestCase.class,
    // org.mule.test.config.spring.parsers.MapCombinerTestCase.class,
    // org.mule.test.config.spring.parsers.specific.MethodInvokerDefinitionParserTestCase.class,
    // org.mule.test.config.spring.parsers.specific.CompositeMessageProcessorDefinitionParserTestCase.class,
    // org.mule.test.config.spring.parsers.specific.ServerNotificationManagerTestCase.class,
    // org.mule.test.config.spring.parsers.specific.ComponentDefinitionParserFlowTestCase.class,
    // org.mule.test.config.spring.parsers.OrphanNamespaceTestCase.class,
    // org.mule.test.config.spring.parsers.CollectionTestCase.class,
    // org.mule.test.config.spring.parsers.OrphanSimpleTestCase.class,
    // org.mule.test.config.spring.parsers.CustomTransactionManagerTestCase.class,
    // org.mule.test.config.spring.parsers.AliasTestCase.class,
    // org.mule.test.config.spring.parsers.XmlDslProcessingValidationTestCase.class,
    // org.mule.test.config.spring.parsers.IgnoredTestCase.class,
    // org.mule.test.config.spring.parsers.XmlDslProcessingTestCase.class,
    // org.mule.test.config.spring.parsers.ReferenceTestCase.class,
    // org.mule.test.config.spring.parsers.MapEntryCombinerTestCase.class, org.mule.test.config.StartupPropertiesTestCase.class,
    // org.mule.test.config.MuleConfigurationTestCase.class, org.mule.test.config.ConfigurationAnnotationsTestCase.class,
    // org.mule.test.config.JndiFunctionalTestCase.class, org.mule.test.config.SecurityNamespaceHandlerTestCase.class,
    // org.mule.test.config.I18nMessagesTestCase.class, org.mule.test.config.dsl.ConfigurationProcessingTestCase.class,
    // org.mule.test.config.dsl.PropertiesTestCase.class, org.mule.test.config.dsl.CustomizedXmlNamespacePrefixTestCase.class,
    // org.mule.test.NoArgsCallWrapperFunctionalTestCase.class,
    // org.mule.test.usecases.routing.ForwardingMessageSplitterTestCase.class,
    // org.mule.test.usecases.routing.response.SerializationOnResponseAggregatorTestCase.class,
    // org.mule.test.usecases.routing.response.ResponseAggregatorTestCase.class,
    // org.mule.test.usecases.sync.HttpJmsBridgeTestCase.class, org.mule.test.usecases.sync.HttpTransformTestCase.class,
    // org.mule.test.firewall.FirewallTestCase.class, org.mule.test.el.ExpressionLanguageConfigTestCase.class,
    // org.mule.test.el.ExpressionLanguageConcurrencyTestCase.class,
    // org.mule.test.service.scheduler.SchedulerServiceTestCase.class,
    // org.mule.test.transformers.ExpressionTransformerTestCase.class,
    // org.mule.test.transformers.TransformerEncodingTestCase.class,
    // org.mule.test.transformers.GZipTransformerFunctionalTestCase.class,
    // org.mule.test.transformers.SpringPrototypesLifecycleTestCase.class,
    // org.mule.test.transformers.GraphTransformerResolutionTestCase.class,
    // org.mule.test.transformers.AutoTransformerTestCase.class,
    // org.mule.test.transformers.ConvertersNotRegisteredTwiceTestCase.class,
    // org.mule.test.transformers.ImplicitTransformationTestCase.class,
    // org.mule.test.integration.transformer.response.ResponseTransformerOnMessageCollectionTestCase.class,
    // org.mule.test.integration.transformer.TransformerOnMessageCollectionTestCase.class,
    // org.mule.test.integration.transformer.TransformerTrackerLifecycleTestCase.class,
    // org.mule.test.integration.resolvers.MethodEntryPointWithTransformerTestCase.class,
    // org.mule.test.integration.resolvers.NoArgsEntryPointResolverTestCase.class,
    // org.mule.test.integration.resolvers.EntryPointResolverTestCase.class,
    // org.mule.test.integration.resolvers.DefaultEntryPointResolverSetMultithreadingTestCase.class,
    // org.mule.test.integration.resolvers.MethodEntryPointsTestCase.class,
    // org.mule.test.integration.routing.MessageChunkingTestCase.class,
    // org.mule.test.integration.routing.outbound.ExpressionSplitterMixedSyncAsyncTestCase.class,
    // org.mule.test.integration.routing.outbound.MulticasterMixedSyncAsyncTestCase.class,
    // org.mule.test.integration.routing.outbound.ExpressionSplitterAsyncTestCase.class,
    // org.mule.test.integration.routing.outbound.MulticastSyncWithTransformersTestCase.class,
    // org.mule.test.integration.routing.outbound.MulticasterAsyncTestCase.class,
    // org.mule.test.integration.routing.outbound.MulticastSyncTestCase.class,
    // org.mule.test.integration.routing.outbound.ExpressionSplitterSyncTestCase.class,
    // org.mule.test.integration.routing.outbound.MulticastAsyncWithTransformersTestCase.class,
    // org.mule.test.integration.routing.outbound.UntilSuccessfulRetryExhaustedTestCase.class,
    // org.mule.test.integration.routing.WireTapTestCase.class,
    // org.mule.test.integration.routing.UntilSuccessfulExceptionStrategyTestCase.class,
    // org.mule.test.integration.routing.inbound.InboundRouterSyncAsyncClientTestCase.class,
    // org.mule.test.integration.routing.inbound.IdempotentRouterWithFilterTestCase.class,
    // org.mule.test.integration.routing.FlowBridgingTestCase.class,
    // org.mule.test.integration.message.PropertyScopeTestCase.class,
    // org.mule.test.integration.message.HttpPropertyScopeTestCase.class,
    // org.mule.test.integration.locator.ConfigurationComponentLocatorTestCase.class,
    // org.mule.test.integration.interception.ProcessorInterceptorFactoryTestCase.class,
    // org.mule.test.integration.EventMetaDataPropagationTestCase.class,
    // org.mule.test.integration.config.DisableTimeoutsConfigTestCase.class,
    // org.mule.test.integration.config.CustomConfigTestCase.class,
    // org.mule.test.integration.config.GlobalTransformerTestCase.class,
    // org.mule.test.integration.ClusterizableMessageSourceFlowTestCase.class,
    // org.mule.test.integration.util.ObjectNameHelperTestCase.class,
    // org.mule.test.integration.streaming.CloseStreamOnMuleExceptionTestCase.class,
    // org.mule.test.integration.messaging.meps.SynchronousResponseExceptionTestCase.class,
    // org.mule.test.integration.messaging.meps.InOptionalOutOutOnlyAsyncRouterTestCase.class,
    // org.mule.test.integration.messaging.meps.InOnlyOutOnlyTestCase.class,
    // org.mule.test.integration.messaging.meps.InOutTestCase.class,
    // org.mule.test.integration.messaging.meps.InOutOutOnlyTestCase.class,
    // org.mule.test.integration.messaging.meps.InOptionalOutTestCase.class,
    // org.mule.test.integration.messaging.meps.InOnlyOptionalOutTestCase.class,
    // org.mule.test.integration.messaging.meps.InOnlyTestCase.class,
    // org.mule.test.integration.messaging.meps.InOptionalOutOutOnlyTestCase.class,
    // org.mule.test.integration.el.ExpressionLanguageExtensionTestCase.class,
    // org.mule.test.integration.SchedulerInitialStateTestCase.class,
    // org.mule.test.integration.transaction.TransactionalElementLifecycleTestCase.class,
    // org.mule.test.integration.transaction.xa.XaTransactionsPersistentQueueTestCase.class,
    // org.mule.test.integration.transaction.TransactionManagerInjectTestCase.class,
    // org.mule.test.integration.transaction.TransactionalTryTestCase.class,
    // org.mule.test.integration.domain.properties.DomainPropertiesPlaceHolderPropagationTestCase.class,
    // org.mule.test.integration.domain.tls.TlsSharedContextTestCase.class,
    // org.mule.test.integration.domain.http.HttpSharedRequestConfigTestCase.class,
    // org.mule.test.integration.domain.http.HttpSharePortTestCase.class,
    // org.mule.test.integration.domain.http.HttpsSharePortTestCase.class,
    // org.mule.test.integration.domain.http.HttpSharePortSamePathTestCase.class,
    // org.mule.test.integration.domain.xa.XaTransactionManagerTestCase.class,
    // org.mule.test.integration.domain.classloader.ConnectorLevelMessageDispatchingTestCase.class,
    // org.mule.test.integration.domain.db.DomainTransformerRegistrationTestCase.class,
    // org.mule.test.integration.domain.lifecycle.AppAndDomainLifecycleTestCase.class,
    // org.mule.test.integration.filter.RegexFilterTestCase.class,
    // org.mule.test.integration.exceptions.ErrorHandlingConfigurationFailuresTestCase.class,
    // org.mule.test.integration.exceptions.OnErrorContinueTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyReturnMessageTestCase.class,
    // org.mule.test.integration.exceptions.AsyncExceptionHandlingTestCase.class,
    // org.mule.test.integration.exceptions.AsynchronousMessagingExceptionStrategyTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyWithFlowExceptionTestCase.class,
    // org.mule.test.integration.exceptions.ErrorHandlerTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionMappingTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyMessagePropertiesTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyFlowRefTestCase.class,
    // org.mule.test.integration.exceptions.OnErrorContinueFlowRefTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyConstructsTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionRollbackTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyFilterMule5342TestCase.class,
    // org.mule.test.integration.exceptions.ExceptionPropagationMule5737TestCase.class,
    // org.mule.test.integration.exceptions.OnErrorContinueEnricherTestCase.class,
    // org.mule.test.integration.exceptions.DefaultExceptionStrategyTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyLifecycleTestCase.class,
    // org.mule.test.integration.exceptions.DefaultServiceExceptionStrategyTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionListenerTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionHandlingTestCase.class,
    // org.mule.test.integration.exceptions.SynchronousMessagingExceptionStrategyTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionAfterAggregationTestCase.class,
    // org.mule.test.integration.exceptions.DefaultErrorHandlerTestCase.class,
    // org.mule.test.integration.exceptions.OnErrorPropagateTestCase.class,
    // org.mule.test.integration.exceptions.ExceptionStrategyCommonScenariosTestCase.class,
    // org.mule.test.integration.components.NoArgsCallComponentTestCase.class,
    // org.mule.test.integration.components.LifecycleTrackerComponentFunctionalTestCase.class,
    // org.mule.test.integration.components.TransientLifecycleTrackerComponentFunctionalTestCase.class,
    // org.mule.test.integration.interceptor.InterceptorFlowTestCase.class,
    // org.mule.test.integration.interceptor.SharedInterceptorStackTestCase.class,
    // org.mule.test.integration.security.CustomSecurityFilterTestCase.class,
    // org.mule.test.integration.tck.MuleTestNamespaceFunctionalTestCase.class,
    // org.mule.test.integration.work.GracefulShutdownTimeoutTestCase.class,
    // org.mule.test.integration.CompositeSourceStartDelayTestCase.class,
    // org.mule.test.integration.schedule.RunningScheduleTestCase.class,
    // org.mule.test.integration.schedule.PollScheduleTestCase.class,
    // org.mule.test.integration.schedule.PollScheduleNotificationTestCase.class,
    // org.mule.test.integration.SchedulerManagementTestCase.class, org.mule.test.integration.SchedulerTestCase.class,
    // org.mule.test.components.EntryPointResolverCacheTestCase.class, org.mule.test.components.ThrowProcessorTestCase.class,
    // org.mule.test.components.FlowStateTestCase.class, org.mule.test.components.FunctionalTestComponentTestCase.class,
    // org.mule.test.components.PartialStartupTestCase.class, org.mule.test.components.ComponentReturningNullFlowTestCase.class,
    // org.mule.test.components.ObjectFactoryTestCase.class, org.mule.test.components.ServiceDescriptorFlowTestCase.class,
    // org.mule.test.tck.MuleTestNamespaceTestCase.class, org.mule.test.tck.ResponseAssertionMessageProcessorTestCase.class,
    // org.mule.test.tck.AssertionMessageProcessorTestCase.class, org.mule.test.issues.Mule5038TestCase.class,
    // org.mule.util.TemplateParserSpecialCharactersTestCase.class,
    // org.mule.shutdown.ValidShutdownTimeoutRequestResponseTestCase.class, org.mule.shutdown.ShutdownAppInDomainTestCase.class,
    // org.mule.shutdown.ExpiredShutdownTimeoutOneWayTestCase.class,
    // org.mule.shutdown.ExpiredShutdownTimeoutRequestResponseTestCase.class,
    // org.mule.shutdown.ValidShutdownTimeoutOneWayTestCase.class, org.mule.issues.MessageRootIdPropagationTestCase.class,
    // org.mule.issues.PersistentStore6007TestCase.class, org.mule.issues.AsyncComponentLifecycleIssue5649TestCase.class,
    // org.mule.issues.ManySendsMule1758TestCase.class, org.mule.issues.HttpReturnsJaxbObject5531TestCase.class,
    // org.mule.mvel.MvelCompiledExpressionCachingTestCase.class
})
public class SuiteTestCase {

}
