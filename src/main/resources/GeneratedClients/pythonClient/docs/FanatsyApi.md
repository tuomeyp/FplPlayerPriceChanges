# swagger_client.FanatsyApi

All URIs are relative to *https://localhots:8080/playerpricechanges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all_get**](FanatsyApi.md#all_get) | **GET** /all | Get All Weekly Price Change Data


# **all_get**
> list[PriceChanges] all_get()

Get All Weekly Price Change Data

This api get data froma third party fantasy football website an xposed it as a get request 

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FanatsyApi()

try: 
    # Get All Weekly Price Change Data
    api_response = api_instance.all_get()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling FanatsyApi->all_get: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[PriceChanges]**](PriceChanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

