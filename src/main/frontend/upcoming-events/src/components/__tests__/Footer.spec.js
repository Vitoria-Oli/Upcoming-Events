import { describe, it, expect } from "vitest";

import { mount } from "@vue/test-utils";
import Footer from "../Footer.vue";

describe("Footer", () =>{
    it("should have footer tag", () => {
        const wrapper = mount(Footer);
        const footerTag = wrapper.find("footer").exists();
        expect(headerTag).toBe(true);
    });
    it("should have img in header tag", () => {
        const wrapper = mount(Footer);
        const imgTag = wrapper.find("img").exists();
        expect(imgTag).toBe(true);
    });
});
