# Java2JSON
Sample API to convert a POJO to specific JSON format

Developers in our company using your builder API should be able to create json requests like this.


{
"query": { 
"bool": { 

"must": [
{ "match": { "item": "Milk" }}, 
{ "match": { "item_type": "Dairy" }} 
],

"should": [
{ "match": { "product_location": "New Mexico" }}, 
{ "match": { "warehouse_number": 37 }} 
]
}
}
}

Here are the rules for the JSON structure. You can have a single must or should section inside a bool section as shown. But keep in mind that inside of each one of these musts or shoulds, you can have nested bool sections. The match section is simple, you can have any attribute name and it's value. For example, the above json query is filtering for ONLY those items that are "Milk". 
And the "item_type" attribute has the value "Dairy". The product_location should be "New Mexico" with warehouse_number: 37. 


You'll need to create a few java classes that will represent this JSON structure when they are converted to a JSON format.
