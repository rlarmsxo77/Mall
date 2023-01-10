<template>

    <v-data-table
        :headers="headers"
        :items="orderSelect"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderSelectView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderSelect : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderSelects'))

            temp.data._embedded.orderSelects.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderSelect = temp.data._embedded.orderSelects;
        },
        methods: {
        }
    }
</script>

