
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderMngManager from "./components/listers/OrderMngCards"
import OrderMngDetail from "./components/listers/OrderMngDetail"

import ProductSelectView from "./components/ProductSelectView"
import ProductSelectViewDetail from "./components/ProductSelectViewDetail"
import OrderSelectView from "./components/OrderSelectView"
import OrderSelectViewDetail from "./components/OrderSelectViewDetail"
import DeliveryMngManager from "./components/listers/DeliveryMngCards"
import DeliveryMngDetail from "./components/listers/DeliveryMngDetail"

import ProductManager from "./components/listers/ProductCards"
import ProductDetail from "./components/listers/ProductDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderMngs',
                name: 'OrderMngManager',
                component: OrderMngManager
            },
            {
                path: '/orderMngs/:id',
                name: 'OrderMngDetail',
                component: OrderMngDetail
            },

            {
                path: '/productSelects',
                name: 'ProductSelectView',
                component: ProductSelectView
            },
            {
                path: '/productSelects/:id',
                name: 'ProductSelectViewDetail',
                component: ProductSelectViewDetail
            },
            {
                path: '/orderSelects',
                name: 'OrderSelectView',
                component: OrderSelectView
            },
            {
                path: '/orderSelects/:id',
                name: 'OrderSelectViewDetail',
                component: OrderSelectViewDetail
            },
            {
                path: '/deliveryMngs',
                name: 'DeliveryMngManager',
                component: DeliveryMngManager
            },
            {
                path: '/deliveryMngs/:id',
                name: 'DeliveryMngDetail',
                component: DeliveryMngDetail
            },

            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },



    ]
})
